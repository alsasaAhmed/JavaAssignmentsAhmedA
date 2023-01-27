package com.day5.assignment2;

import com.day5.assignment1.Student;

public class DayScholar extends Student {
	
private String residentialAddress;
	
	public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}
	public void getDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
	}

}
