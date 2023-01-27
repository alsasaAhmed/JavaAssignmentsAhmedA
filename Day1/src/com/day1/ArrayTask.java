package com.day1;

public class ArrayTask {
	public static void  main(String args[]) {
		int data[] = {12, -13, 15, 77, -91, 22, -98};
		
		/*System.out.println("Odd numbers: ");
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 2 == 1) {
				System.out.println(data[i]);
			}
		}
		
		System.out.println("Even numbers: ");
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 2 == 0) {
				System.out.println(data[i]);
			}
		}*/
		
		System.out.println("Negative numbers: ");
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] < 0) {
				System.out.println(data[i]);
			}
		}
		
		System.out.println("Positive numbers: ");
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] >= 0) {
				System.out.println(data[i]);
			}
		}
		
		int j = 0;
		while(j < data.length) {
			if(data[j] >= 0) {
				System.out.println(data[j]);
			}
			j++;
		}
	}
}
