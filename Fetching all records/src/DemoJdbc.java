import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Example: Fetching all records using ResultSet
 *
 * Concept:
 * To read multiple rows, we use a while loop with rs.next().
 * The loop continues as long as rs.next() returns true (meaning there is another row).
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
 * ID: 101 - Name: John Doe - Course: Computer Science
 * ID: 102 - Name: Jane Smith - Course: Mathematics
 */
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";
        
        String sql = "SELECT * FROM student";

        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        System.out.println("Fetching all students:");
        System.out.println("----------------------");
        
        // Loop through the entire ResultSet
        while (rs.next()){
            // We can retrieve data by index (1-based) or column name
            int id = rs.getInt("id"); // or rs.getInt(1)
            String name = rs.getString("name"); // or rs.getString(2)
            String course = rs.getString("course"); // or rs.getString(4)
            
            System.out.println("ID: " + id + " - Name: " + name + " - Course: " + course);
        }

        rs.close();
        st.close();
        con.close();
    }
}
