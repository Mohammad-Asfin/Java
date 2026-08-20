import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Concept: CallableStatement
 * 
 * While Statement and PreparedStatement execute standard SQL queries, 
 * CallableStatement is specifically used to call Stored Procedures in the database.
 * 
 * Note: For this to work, you must create a stored procedure in your database first.
 * PostgreSQL Example:
 * CREATE OR REPLACE PROCEDURE get_student_course(student_id INT, OUT out_course VARCHAR)
 * LANGUAGE plpgsql AS $$
 * BEGIN
 *     SELECT course INTO out_course FROM student WHERE id = student_id;
 * END;
 * $$;
 */
public class DemoJdbc {
    public static void main(String[] args) {
        
        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";
        
        // Syntax to call a stored procedure
        String sql = "{call get_student_course(?, ?)}";

        try (Connection con = DriverManager.getConnection(url, uname, pass);
             CallableStatement cst = con.prepareCall(sql)) {
            
            // 1. Set the IN parameter (Input)
            cst.setInt(1, 1); // Pass Student ID 1
            
            // 2. Register the OUT parameter (Output)
            cst.registerOutParameter(2, Types.VARCHAR);
            
            // 3. Execute the procedure
            cst.execute();
            
            // 4. Retrieve the OUT parameter value
            String course = cst.getString(2);
            
            System.out.println("Student is enrolled in: " + course);

        } catch (SQLException e) {
            System.err.println("Database Error. Make sure the stored procedure exists!");
            System.err.println(e.getMessage());
        }
    }
}
