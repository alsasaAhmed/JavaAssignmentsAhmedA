package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee employee) throws ClassNotFoundException;
	public List<Employee> loadEmployee();
	public Employee findEmployee(String name);
	public void deleteEmployee(int id);
	public void updateEmp(int id, Employee emp);
}
