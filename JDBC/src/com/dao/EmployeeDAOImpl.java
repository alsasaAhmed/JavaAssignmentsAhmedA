package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.ConnectionInit;
import com.model.Employee;
	
	public class EmployeeDAOImpl implements EmployeeDAO{
		
		Connection conn= ConnectionInit.loadConnection();
		PreparedStatement stmt;
	     ResultSet rs=null;
	     ArrayList<Employee>al= new ArrayList<Employee>();
		@Override
		public void addEmployee(Employee employee) {

			String insertStatement="insert into employee values(?,?,?)";

			try {
				stmt = conn.prepareStatement(insertStatement);
				stmt.setInt(1, employee.getEmpId());
				stmt.setString(2, employee.getName());
				stmt.setString(3, employee.getCity());
				int data=stmt.executeUpdate();
				if(data > 0)
					System.out.println("Employee added");
				
			} catch (SQLException e) {
				 
			}}

		@Override
		public List<Employee> loadEmployee() {
			try {
			String query="select * from employee";
			stmt=conn.prepareStatement(query);
			rs= stmt.executeQuery();
			while(rs.next()) {
			Employee em= new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
			al.add(em);
			
			 
			}}catch (Exception e) {}
			return al;
		}
		
		public Employee findEmployee(String name) {
		Employee em = null;
		try {
			String query = "select * from employee where empname=?";
			stmt = conn.prepareStatement(query);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			while(rs.next()) {
				em = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		}catch (Exception e) {
		}
		return em; 

		}

		@Override
		public void deleteEmployee(int id) {
			// TODO Auto-generated method stub
			try {
				String deleteQuery = "delete from employee where empid=?";
				stmt = conn.prepareStatement(deleteQuery);
				stmt.setInt(2, id);
				
				stmt.executeUpdate();
				
	
			}catch(Exception e){}
	}

		@Override
		public void updateEmp(int id, Employee emp) {
			try {
				String updateQuery = "update employee set empname=? where empid?";
				stmt = conn.prepareStatement(updateQuery);
				stmt.setString(1, emp.getName());
				stmt.setInt(2, id);
				stmt.executeQuery();
				
				
	
			}catch(Exception e){}
	}
}
	
