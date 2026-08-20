import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Example: Complete CRUD Operations
 *
 * Concept:
 * This program demonstrates CREATE, READ, UPDATE, and DELETE operations
 * sequentially using a Statement.
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
 */
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";

        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        System.out.println("Connection established.\n");

        // 1. CREATE (Insert)
        String insertSql = "INSERT INTO student (id, name, age, course) VALUES (201, 'Alice', 22, 'Math')";
        st.executeUpdate(insertSql);
        System.out.println("1. INSERT: Alice added to the database.");

        // 2. READ (Select)
        System.out.println("2. READ: Fetching current data...");
        ResultSet rs = st.executeQuery("SELECT * FROM student WHERE id = 201");
        while (rs.next()) {
            System.out.println("   -> ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
        }

        // 3. UPDATE
        String updateSql = "UPDATE student SET age = 23 WHERE id = 201";
        st.executeUpdate(updateSql);
        System.out.println("3. UPDATE: Alice's age updated to 23.");

        // 4. DELETE
        String deleteSql = "DELETE FROM student WHERE id = 201";
        st.executeUpdate(deleteSql);
        System.out.println("4. DELETE: Alice removed from the database.");

        rs.close();
        st.close();
        con.close();
        System.out.println("\nAll operations completed and resources closed.");
    }
}
