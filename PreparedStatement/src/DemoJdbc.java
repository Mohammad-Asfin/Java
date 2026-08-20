import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Example: PreparedStatement (Parameterized SQL)
 *
 * Concept:
 * PreparedStatement extends Statement. It is precompiled, making it faster 
 * for repeated execution. Most importantly, it uses placeholders (?) to securely 
 * inject variables, preventing SQL injection attacks.
 *
 * Database Schema:
 * CREATE DATABASE java_jdbc;
 * USE java_jdbc;
 * CREATE TABLE student (
 *     id INT PRIMARY KEY AUTO_INCREMENT,
 *     name VARCHAR(100),
 *     age INT,
 *     course VARCHAR(100)
 * );
 *
 * Expected Output:
 * Record inserted securely using PreparedStatement.
 */
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        // Dynamic data to insert
        int sid = 102;
        String sname = "Jasmine";
        int age = 21;
        String course = "Physics";

        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";

        // SQL query with '?' placeholders
        String sql = "INSERT INTO student (id, name, age, course) VALUES (?, ?, ?, ?)";

        Connection con = DriverManager.getConnection(url, uname, pass);
        
        // Create the PreparedStatement by passing the SQL upfront
        PreparedStatement pst = con.prepareStatement(sql);
        
        // Bind the parameters to the placeholders (1-based index)
        pst.setInt(1, sid);
        pst.setString(2, sname);
        pst.setInt(3, age);
        pst.setString(4, course);
        
        // Execute the query
        pst.executeUpdate();
        
        System.out.println("Record inserted securely using PreparedStatement.");

        pst.close();
        con.close();
    }
}
