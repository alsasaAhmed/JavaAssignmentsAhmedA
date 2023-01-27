package com.day1;
import java.util.Scanner;

public class ScannerDemo {
	public static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		
		int size;
		System.out.println("Enter size: ");
		
		size = scan.nextInt();
		
		int num_array[] = new int[size];
		
		System.out.println("Enter values: ");
		
		for(int i = 0 ; i < size; i++) {
			num_array[i] = scan.nextInt();
		}
		
		//System.out.println("Print negatives: ");
		
		/*for(int i = 0; i < size; i++) {
			if(num_array[i] >= 0) {
				System.out.println(num_array[i]);
			}
		}*/
		
		printNegatives(num_array, size);
		printEvens(num_array, size);
		printOdds(num_array, size);
	}
	
	public static void printNegatives(int[] neg_array, int size) {
		System.out.println("Print negatives: ");
		
		for(int i = 0; i < size; i++) {
			if(neg_array[i] < 0) {
				System.out.println(neg_array[i]);
			}
		}
	}
	
	public static void printEvens(int[] even_array, int size) {
		System.out.println("Print even nums: ");
		
		for(int i = 0; i < size; i++) {
			if(even_array[i] % 2 == 0) {
				System.out.println(even_array[i]);
			}
		}
	}
	
	public static void printOdds(int[] odd_array, int size) {
		System.out.println("Print odd nums: ");
		
		for(int i = 0; i < size; i++) {
			if(odd_array[i] % 2 != 0) {
				System.out.println(odd_array[i]);
			}
		}
	}

}
