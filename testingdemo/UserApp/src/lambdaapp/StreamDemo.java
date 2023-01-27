package lambdaapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamDemo {
	
	private static int sumData(List<Integer> list) {
		/*
		 * Iterator<Integer> it = list.iterator(); int sum = 0;
		 * 
		 * while(it.hasNext()) { int num = it.next(); if(num > 10 ) { sum+=num; }
		 * 
		 * } return sum;
		 */
		
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum(); 
	}
	

	
	static List<Integer> al = Arrays.asList(12, 13, 10, 4, 17, 33, 28);
	static List<String> name = Arrays.asList("amit", "shekhar", "ana", "sam", "yani");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ArrayList<Integer> al = new ArrayList<Integer>(); 
		
		name.stream().filter((s) -> s.startsWith("a")).map(String :: toUpperCase).forEach(System.out::println);
		
		
		// System.out.println(sumData(al));
		
		
		//al.add(20);
		
	}

}
