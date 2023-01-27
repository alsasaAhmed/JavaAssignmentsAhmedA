package com.model;

public class Student {
	
	private int studentId;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", contactNo=" + contactNo + "]";
	}
	public Student(int studentId, String studentName, int contactNo) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.contactNo = contactNo;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	private String studentName; 
	private int contactNo; 

}
