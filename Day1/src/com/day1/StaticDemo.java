package com.day1;

public class StaticDemo {
	static String username = "Joshua";
	
	static void show() {
		System.out.println("Static method " + username);
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		
		show();
	}
	static {
		System.out.println("Static");
	}
}
