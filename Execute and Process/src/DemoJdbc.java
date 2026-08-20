import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Example: Execute Query and Process Result (Select One Record)
 *
 * Concept:
 * When selecting data, we use executeQuery() instead of executeUpdate().
 * executeQuery() returns a ResultSet object representing the database rows.
 * We must call rs.next() to move the cursor to the first row before reading.
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
 * Name of the student is: John Doe
 */
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";
        
        // SQL query to fetch a specific record
        String sql = "SELECT name FROM student WHERE id=101";

        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        
        // executeQuery is used for SELECT statements
        ResultSet rs = st.executeQuery(sql);
        
        // rs.next() moves the cursor to the first row. 
        // It returns true if a row exists, false if empty.
        if (rs.next()) {
            // Retrieve the data using the column name or index
            String name = rs.getString("name");
            System.out.println("Name of the student is: " + name);
        } else {
            System.out.println("Student with ID 101 not found.");
        }
        
        rs.close();
        st.close();
        con.close();
    }
}
