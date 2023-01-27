package lambdaapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpList {

	

	
	
	static ArrayList<Employee>  al = new ArrayList<Employee>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<Employee>  al = new ArrayList<Employee>();
		
		al.add(new Employee(103, "adam", "science"));
		al.add(new Employee(101, "sam", "physics"));
		al.add(new Employee(102, "ira", "chem"));
		
		/*
		 * Collections.sort(al, new Comparator<Employee>() {;
		 * 
		 * 
		 * public int compare(Employee o1, Employee o2) { return
		 * o1.getEmpId()-o2.getEmpId(); } });
		 */
		
		
		Collections.sort(al, (Employee o1, Employee o2) -> o1.getEmpId()-o2.getEmpId());
		
		
		for(Employee emp:al)
		{
			System.out.println(emp);
		}
		
		//System.out.println(al.remove(2));
		//System.out.println(al.size());
		
		
		//searchUser("adam");//
		
		

	}

}
