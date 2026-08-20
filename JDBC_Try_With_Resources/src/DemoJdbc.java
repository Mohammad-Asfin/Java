import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Example: Using try-with-resources in JDBC
 *
 * Concept:
 * Java 7 introduced try-with-resources. Objects that implement AutoCloseable
 * (like Connection, Statement, and ResultSet) can be declared in the try() clause.
 * Java will automatically close them at the end of the block, even if exceptions occur.
 * This makes the code much cleaner than using finally blocks.
 *
 * Expected Output:
 * Connection successful! Automatically fetching data...
 */
public class DemoJdbc {
    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";
        String sql = "SELECT * FROM student";
        
        // Auto-closing Connection, PreparedStatement, and ResultSet
        try (
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
        ) {
            System.out.println("Connection successful! Automatically fetching data...");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " - Name: " + rs.getString("name"));
            }
            
            // We DO NOT need to manually call con.close(), pst.close(), or rs.close()
            // The try-with-resources block handles it automatically!
            
        } catch (SQLException e) {
            System.err.println("Database Error: " + e.getMessage());
        }
    }
}
