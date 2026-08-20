import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Example: Proper Exception Handling in JDBC
 *
 * Concept:
 * JDBC methods throw SQLException. Instead of just adding 'throws Exception'
 * to the main method, we should catch SQLException to gracefully handle errors
 * and ensure resources are closed in a finally block.
 *
 * Expected Output (if connection fails):
 * Error code: 0
 * SQL State: 08001
 * Error message: Connection to localhost:5432 refused.
 */
public class DemoJdbc {
    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "WRONG_PASSWORD"; // Intentional mistake
        
        Connection con = null;
        Statement st = null;
        
        try {
            // Establish connection
            con = DriverManager.getConnection(url, uname, pass);
            System.out.println("Connection established");
            
            st = con.createStatement();
            st.execute("SELECT * FROM non_existent_table"); // Intentional mistake
            
        } catch (SQLException e) {
            // This block handles JDBC-specific exceptions
            System.err.println("Database Error occurred!");
            System.err.println("Error code: " + e.getErrorCode());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error message: " + e.getMessage());
        } finally {
            // The finally block ensures that resources are closed 
            // even if an exception occurs above.
            try {
                if (st != null) st.close();
            } catch (SQLException e) {
                System.err.println("Failed to close statement.");
            }
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println("Failed to close connection.");
            }
            System.out.println("Resources closed gracefully.");
        }
    }
}
