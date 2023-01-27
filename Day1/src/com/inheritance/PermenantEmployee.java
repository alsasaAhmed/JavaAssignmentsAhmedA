package com.inheritance;

public class PermenantEmployee extends Employee {

	public PermenantEmployee(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takesLeave() {
		// TODO Auto-generated method stub
		System.out.println("Permenant Employee takes leave");
	}

	@Override
	public void assignProject() {
		// TODO Auto-generated method stub
		System.out.println("Permenant Employee assigned to project");
	}

}
