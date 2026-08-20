import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Example: Insert One Record using Statement
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
 * Connection established
 * 1 row(s) inserted successfully.
 * Connection closed
 */
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        
        // 1. Define connection details
        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD"; // Replace with your actual password
        
        // The SQL query to insert data
        String sql = "INSERT INTO student (id, name, age, course) VALUES (101, 'John Doe', 20, 'Computer Science')";

        // 2. Establish connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");
        
        // 3. Create Statement
        Statement st = con.createStatement();
        
        // 4. Execute SQL
        // executeUpdate returns the number of rows affected by the query
        int rowsAffected = st.executeUpdate(sql);
        System.out.println(rowsAffected + " row(s) inserted successfully.");
        
        // 5. Close resources
        st.close();
        con.close();
        System.out.println("Connection closed");
    }
}
