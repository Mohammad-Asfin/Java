import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Concept: JDBC Transactions
 * 
 * By default, every SQL statement executed in JDBC is committed to the database immediately.
 * A Transaction groups multiple SQL operations into a single unit of work.
 * If one operation fails, we can rollback() to undo the entire transaction.
 * If all succeed, we commit() to permanently save the changes.
 * 
 * Analogy: Bank Transfer. Deducting from Account A and adding to Account B must BOTH succeed.
 */
public class DemoJdbc {
    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";
        
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, uname, pass);
            
            // 1. Turn off auto-commit to start a manual transaction
            con.setAutoCommit(false);
            
            // Operation 1
            PreparedStatement pst1 = con.prepareStatement("UPDATE student SET age = age + 1 WHERE id = 1");
            pst1.executeUpdate();
            System.out.println("Operation 1 executed.");
            
            // Simulating a sudden error in the middle of the transaction
            if (true) {
                throw new SQLException("Simulated Error during transaction!");
            }
            
            // Operation 2 (Will not be reached because of the exception)
            PreparedStatement pst2 = con.prepareStatement("UPDATE student SET age = age - 1 WHERE id = 2");
            pst2.executeUpdate();
            System.out.println("Operation 2 executed.");

            // 2. Commit the transaction if everything succeeded
            con.commit();
            System.out.println("Transaction Committed Successfully.");

        } catch (SQLException e) {
            System.err.println("Transaction Failed! Reason: " + e.getMessage());
            
            // 3. Rollback the transaction to undo Operation 1
            if (con != null) {
                try {
                    System.out.println("Rolling back transaction to preserve data integrity...");
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            if (con != null) {
                try { con.close(); } catch (SQLException e) {}
            }
        }
    }
}
