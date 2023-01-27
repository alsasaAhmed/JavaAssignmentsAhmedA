package com.inheritance;

public class ContractEmployee extends Employee{

	public ContractEmployee(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takesLeave() {
		// TODO Auto-generated method stub
		System.out.println("Contract Employee takes leave");
	}

	@Override
	public void assignProject() {
		// TODO Auto-generated method stub
		System.out.println("Contract Employee asssigned to project");
	}
	
}
