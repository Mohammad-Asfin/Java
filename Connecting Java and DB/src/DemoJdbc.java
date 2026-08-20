import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Example: Establish a Database Connection
 *
 * Concept:
 * This is the very first step in JDBC. We use the DriverManager class to 
 * obtain a Connection to our specific database using a connection URL.
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
 * Connection established to PostgreSQL successfully!
 */
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /*
        JDBC Workflow:
        1. Import java.sql package (Done above)
        2. Load and register driver (Optional in modern JDBC)
        3. Create connection
        */

        // 1. Define connection details
        // jdbc:subprotocol:subname
        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD"; // Replace with your password

        // Modern JDBC (4.0+) automatically loads the driver, so Class.forName() is optional
        // Class.forName("org.postgresql.Driver");

        // 2. Establish connection
        // The DriverManager acts as a factory for Connection objects.
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established to PostgreSQL successfully!");

        // 3. Always close the connection when done to release resources
        con.close();
        System.out.println("Connection closed");
    }
}
