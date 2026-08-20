package jdbc.student.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class to handle the database connection.
 * Keeps connection details in one place.
 */
public class DBConnection {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/java_jdbc";
    private static final String USER = "postgres";
    private static final String PASS = "YOUR_PASSWORD"; 

    /**
     * @return Connection object to PostgreSQL
     */
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.err.println("Database Connection Failed: " + e.getMessage());
        }
        return con;
    }
}
