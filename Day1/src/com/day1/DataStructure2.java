package com.day1;

public class DataStructure2 {
	private static int size = 6;
	private int[] data = {4, -5, 24, 27, 8, -8};
	
	public void printEven() {
		InnerEven even = new InnerEven();
		while(even.hasNext() && even.IsEven()) {
			System.out.println(data[even.index()]);
			even.increment();
		}
	}
	
	private class InnerEven {
		private int next = 0;
		
		public boolean hasNext() {
			return (next < size - 1);
		}
		
		public boolean IsEven() {
			if(data[next] % 2 == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public int index() {
			return next;
		}
		
		public void increment() {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStructure2 struct = new DataStructure2();
		struct.printEven();
	}

}
