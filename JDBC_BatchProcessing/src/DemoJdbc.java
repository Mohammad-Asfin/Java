import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Concept: JDBC Batch Processing
 * 
 * Instead of executing 100 INSERT queries one-by-one (which makes 100 network trips),
 * Batch Processing allows you to group them into a single "batch" and send them 
 * to the database in one shot. This drastically improves performance.
 */
public class DemoJdbc {
    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";
        
        String sql = "INSERT INTO student (name, age, course) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, uname, pass);
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            // Record 1
            pst.setString(1, "Alice");
            pst.setInt(2, 21);
            pst.setString(3, "History");
            pst.addBatch(); // Adds to the batch, doesn't execute yet
            
            // Record 2
            pst.setString(1, "Bob");
            pst.setInt(2, 22);
            pst.setString(3, "Math");
            pst.addBatch();
            
            // Record 3
            pst.setString(1, "Charlie");
            pst.setInt(2, 23);
            pst.setString(3, "Science");
            pst.addBatch();
            
            // Execute the entire batch
            System.out.println("Executing Batch Insert...");
            int[] results = pst.executeBatch();
            
            System.out.println(results.length + " records inserted via batch processing!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
