package com.inheritance;

public class EmpMain {
	public static void main(String[] args) {
		Employee emp = new PermenantEmployee(101, "admin");
		Employee emp2 = new ContractEmployee(102, "manager");
		
		emp.assignProject();
		emp2.assignProject();
		
		System.out.println(emp);
		System.out.println(emp2);
	}
}
