package jdbc.student.management;

import java.util.List;
import java.util.Scanner;

/**
 * Main Application Entry Point
 * Provides a simple Console UI to interact with the StudentDAO.
 */
public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOImpl();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=========================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM (JDBC DAO)  ");
        System.out.println("=========================================");

        while (running) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Search by Name");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    dao.addStudent(new Student(name, age, course));
                    break;

                case 2:
                    System.out.println("\n--- All Students ---");
                    List<Student> students = dao.getAllStudents();
                    for (Student s : students) System.out.println(s);
                    break;

                case 3:
                    System.out.print("Enter student ID to find: ");
                    int searchId = scanner.nextInt();
                    Student s = dao.getStudentById(searchId);
                    if (s != null) System.out.println("Found: " + s);
                    else System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    Student existing = dao.getStudentById(updateId);
                    if (existing != null) {
                        System.out.print("Enter new name (" + existing.getName() + "): ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new age (" + existing.getAge() + "): ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter new course (" + existing.getCourse() + "): ");
                        String newCourse = scanner.nextLine();
                        
                        existing.setName(newName);
                        existing.setAge(newAge);
                        existing.setCourse(newCourse);
                        dao.updateStudent(existing);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter student ID to delete: ");
                    int delId = scanner.nextInt();
                    dao.deleteStudent(delId);
                    break;

                case 6:
                    System.out.print("Enter keyword to search in names: ");
                    String keyword = scanner.nextLine();
                    List<Student> found = dao.searchStudentByName(keyword);
                    System.out.println("\n--- Search Results ---");
                    for (Student f : found) System.out.println(f);
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting Application...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
