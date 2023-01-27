package lambdaapp;

public class Employee  {
	
	//implements Comparable for Treeset
	//implements Comparable<Employee>
	
	private int empId; 
	private String empName; 
	private String department;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + "]";
	}
	public Employee(int empId, String empName, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	} 
	
	/*@Override
	public int compareTo(Employee o) {
		return o.getEmpId()-this.getEmpId();
	}
	also for treeset
	*/
	
	

}
