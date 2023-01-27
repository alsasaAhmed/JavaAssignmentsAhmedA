package com.exception;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
		int data = Integer.parseInt(args[0])/Integer.parseInt(args[1]); 
		
		System.out.println(data); 
		
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero"); 
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide values");
		}finally {
			System.out.println("Finally getting called.."); 
		}
	}

}
