import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;
    String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

/**
 * Concept: Stream Collectors (Java 8)
 * 
 * collect() is a terminal operation used to transform the elements of a stream 
 * into a different data structure like List, Set, or Map.
 * Collectors.groupingBy() and Collectors.partitioningBy() are highly useful for Backend Devs.
 */
public class Demo {
    public static void main(String[] args) {
        
        List<Student> students = Arrays.asList(
            new Student("Asfin", "Java"),
            new Student("Rohan", "Python"),
            new Student("Navin", "Java"),
            new Student("Kiran", "Python")
        );

        // 1. Collecting Stream into a List
        List<String> javaStudentsList = students.stream()
            .filter(s -> s.course.equals("Java"))
            .map(s -> s.name)
            .collect(Collectors.toList());
            
        System.out.println("Java Students (List): " + javaStudentsList);

        // 2. Grouping By (Like SQL GROUP BY)
        // Group students by their course
        Map<String, List<Student>> studentsByCourse = students.stream()
            .collect(Collectors.groupingBy(s -> s.course));
            
        System.out.println("\nGrouped by Course: " + studentsByCourse);

        // 3. Partitioning By (True/False grouping)
        // Partition students: those taking Java (true) vs others (false)
        Map<Boolean, List<Student>> isJavaStudent = students.stream()
            .collect(Collectors.partitioningBy(s -> s.course.equals("Java")));
            
        System.out.println("\nPartitioned (Is Java?): " + isJavaStudent);
    }
}
