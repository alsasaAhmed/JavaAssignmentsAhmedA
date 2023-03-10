package com.inheritance;

public abstract class Employee {
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee[empId: " + empId + ", empName: " + empName + "]";
	}
	
	public abstract void takesLeave();
	public abstract void assignProject();

}
