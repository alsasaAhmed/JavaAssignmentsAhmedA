package com.day1;

public class ArrayDemo {

	public static void main(String[] args) {
		int userData[] = new int[5];
		
		userData[0] = 101;
		userData[1] = 102;
		userData[2] = 103;
		
		int userData2[] = {201, 202, 203};
		
		for(int data: userData2) {
			System.out.println(data);
		}
		
		for(int i = 0; i < userData.length; i++) {
			System.out.println(userData[i]);
		}
	}

}
