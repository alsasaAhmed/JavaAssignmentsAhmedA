package com.client;


import java.util.List;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.model.Employee;


public class Client {
	
	public static void main(String[] args) throws ClassNotFoundException {
		 
		Employee emp= new Employee(101, "admin", "Delhi");
		
		EmployeeDAO ed= new EmployeeDAOImpl();
		
		//ed.addEmployee(emp);
		
		List<Employee> data = ed.loadEmployee();
		
		for(Employee em:data) {
			System.out.println(em); 
		}
		
		Employee em = ed.findEmployee("admin");
		System.out.println(em);
		
		ed.deleteEmployee(101);
		//ed.updateEmp(1, emp);
		

	}

}
