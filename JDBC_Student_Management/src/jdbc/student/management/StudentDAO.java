package jdbc.student.management;

import java.util.List;

/**
 * Data Access Object (DAO) Interface
 * Defines standard operations to be performed on a model object(s).
 */
public interface StudentDAO {
    
    void addStudent(Student student);
    
    Student getStudentById(int id);
    
    List<Student> getAllStudents();
    
    void updateStudent(Student student);
    
    void deleteStudent(int id);
    
    List<Student> searchStudentByName(String keyword);
}
