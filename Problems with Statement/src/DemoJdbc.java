import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Example: Problems with basic Statement (SQL Injection Risk)
 *
 * Concept:
 * Using a regular Statement requires string concatenation to insert dynamic data.
 * This is extremely error-prone (quotes, plus signs) and highly vulnerable 
 * to SQL Injection attacks if the variables come from user input.
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

        // Dynamic data
        int sid = 103;
        String sname = "Max";
        int age = 22;
        String course = "Chemistry";

        String url = "jdbc:postgresql://localhost:5432/java_jdbc";
        String uname = "postgres";
        String pass = "YOUR_PASSWORD";

        // PROBLEM: Ugly string concatenation
        // Very easy to miss a single quote or plus sign
        String sql = "INSERT INTO student (id, name, age, course) VALUES (" + sid + ", '" + sname + "', " + age + ", '" + course + "')";
        
        /*
         * SQL INJECTION VULNERABILITY:
         * If sname was user input like: "Max', 22, 'Chem'); DROP TABLE student; --"
         * The resulting SQL would execute a drop table command!
         */

        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        
        System.out.println("Executing messy SQL: " + sql);
        st.execute(sql);

        System.out.println("Record inserted, but this approach is NOT recommended!");

        st.close();
        con.close();
    }
}
