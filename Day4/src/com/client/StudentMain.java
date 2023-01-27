package com.client;

import com.dao.StudentDAO;
import com.dao.StudentManagement;
import com.model.Student;
import java.util.List; 

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(101, "adam", 889986);
		Student s2 = new Student(102, "adam", 889986);
		StudentDAO dao = new StudentManagement();
		dao.addStudent(s1);
		dao.addStudent(s2);
		
		//dao.deleteStudent(102);
		
		dao.updateStudent(101, "alina", 99999);
		
		System.out.println("Loading All Students..");
		
		List<Student> data = dao.loadStudents();
		for(Student st:data )
		{
			System.out.println(st);
		}
		
		//System.out.println("Finding students");
		
		//Student stud = dao.findStudent(101);
		//System.out.println(stud.getStudentName());
		
		
		
		
		
		
		
		
		
		
	}

}
