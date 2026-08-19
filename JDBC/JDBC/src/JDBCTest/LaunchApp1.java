package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection
        String url = "jdbc:mysql://localhost:3306/jdb_Test";
        String user = "root";
        String password = "MySQL#1234#@";

        Connection connect = DriverManager.getConnection(url, user, password);

        // Creating Statement
        Statement statement = connect.createStatement();

        // Execute query
        String sql = "INSERT INTO studentinfo(id, sname, sage, scity) " +
                     "VALUES(1, 'Rohan', 17, 'Bengaluru')";

        int rowAffected = statement.executeUpdate(sql);

        // Process the result
        if (rowAffected == 0) {
            System.out.println("Unable to insert the data");
        } else {
            System.out.println("Data Inserted Successfully!");
        }

        // Close resources
        statement.close();
        connect.close();
    }
}