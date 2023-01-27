package com.day4assignment2;

public class MainStudent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hostelite student = new Hostelite(102, 'C', "Ahmed", 3000, "NEIT", 501);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentType());
		System.out.println(student.getFeesPerMonth());
		System.out.println(student.getHostelName());
		System.out.println(student.getRoomNumber());
	}

}
