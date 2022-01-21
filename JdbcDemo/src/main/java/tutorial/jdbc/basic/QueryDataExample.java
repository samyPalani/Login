package tutorial.jdbc.basic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tutorial.jdbc.ConnectionUtils;

public class QueryDataExample {

    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {

        // Get Connection
        Connection connection = ConnectionUtils.getMyConnection();

        // Create statement
        Statement statement = connection.createStatement();

        String sql = "SELECT  id, first_name, last_name, username, password,address, contact FROM employee";

        // Execute SQL statement returns a ResultSet object.
        ResultSet rs = statement.executeQuery(sql);

        // Fetch on the ResultSet        
        // Move the cursor to the next record.
        while (rs.next()) {
            int Id = rs.getInt(1);
            String firstname = rs.getString(2);
            String lastname = rs.getString("last_name");
            System.out.println("--------------");
            System.out.println("id:"+Id);
            System.out.println("first_name:"+firstname);
            System.out.println("last_name:"+lastname);
        }

        // Close connection.
        connection.close();
    }

}