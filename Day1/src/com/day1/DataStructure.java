package com.day1;

public class DataStructure {
	private static int size = 15;
	private int[] data = new int[size];

	public DataStructure() {
		for(int i = 0; i < size; i++) {
			data[i] = i;
		}
	}

	public void printEven() {
		InnerEven even = new InnerEven();
		while(even.hasNext()) {
			System.out.println(even.getNext());
		}
	}
	
	private class InnerEven {
		private int next = 0;
		
		public boolean hasNext() {
			return (next < size - 1);
		}
		
		public int getNext() {
			int retValue = data[next];
			next += 2;
			return retValue;
		}
	}
	
	public static void main(String args[]) {
		DataStructure struct = new DataStructure();
		struct.printEven();
	}
}
