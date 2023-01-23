package assignments;

public class ByteDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intVal = 100; 
		byte byteVal = (byte)intVal;
		byte max = 127; 
		byte min = -128; 
		int sum = (max + min); 
		//You can either change the value to int or cast the arithmetic operation. Either well, the results will be the same
		
		System.out.println("Sum= " + sum);
		
	}

}
