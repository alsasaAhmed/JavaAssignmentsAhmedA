package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.connection.ConnectionInit;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class InsertDemowithRepair {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection conn = ConnectionInit.loadConnection();
		
		
		String  insertStatment= "insert into employee values(?, ?, ?)";
		
		
		PreparedStatement stmt= conn.prepareStatement(insertStatment);
		
		//Statement smt = conn.createStatement();
		
		//String  insertStatment= "insert into employee values(?, ?, ?)";
		
		//PreparedStatement stmt= conn.prepareStatement(insertStatment);
		
		
		stmt.setInt(1, 101);
		stmt.setString(2, "admin");
		stmt.setString(3, "mumbai");
		
		
		
		int data = stmt.executeUpdate();
		
		
		
		if(data> 0)
		{
			System.out.println("Employee added");
		}
		

	}

}
