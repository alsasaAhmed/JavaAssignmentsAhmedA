package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltidb?serverTimezone=UTC", "root", "root123");
		
		Statement smt = conn.createStatement();
		
		String  insertStatment= "insert into employee values(101, 'admin', 'newyork')";
		int data = smt.executeUpdate(insertStatment);
		
		if(data> 0)
		{
			System.out.println("Employee added");
		}
		
		
		
	}

}
