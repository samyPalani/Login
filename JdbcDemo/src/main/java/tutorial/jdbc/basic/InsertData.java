package tutorial.jdbc.basic;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import tutorial.jdbc.ConnectionUtils;

public class InsertData {
	 public static void main(String[] args) throws ClassNotFoundException,
     SQLException {

 // Get Connection
 Connection connection = ConnectionUtils.getMyConnection();

 Statement statement = connection.createStatement();

 String sql ="INSERT INTO employee (id,contact,first_name)" + "VALUES (7, 122323)";
 
 // Execute statement
 // executeUpdate(String) using for Insert, Update, Delete statement.
 int rowCount = statement.executeUpdate(sql);
     
 System.out.println("Row Count affected = " + rowCount);
}

}
