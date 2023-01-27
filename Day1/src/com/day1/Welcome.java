package com.day1;

public class Welcome {
	public static void main(String args[]) {
		//System.out.println("Hello " + args[0] + " " + args[1]);
		
		int data = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		
		System.out.println("Total is " + data);
	}
}
