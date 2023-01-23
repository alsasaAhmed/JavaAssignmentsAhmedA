package assignments2;

public class class1 {

		int i = 22; 
		int j = 14000; 
		boolean k; 
		boolean 1; 
	
	public static void main(String[] args) {
		// TODO fix the code like the assignment says 
		//Coding Standards assignment 
		i = 22; 
		j = 14000; 
		class clas1 = new class1();
		k = class1.Method1(i);
		l = class1.Method2(j);
		
		if(k==true && 1==true)
		{
			System.out.print(" Is a new employee");
		}
		else {
			System.out.print("Is not a new employee");
		}
		

	}
	
	public boolean Method1(int i)
	{
		if(i>20 && i<30)
		{
			return true;
		}
		else 
		{
			return false; 
		}
	}
	
	public boolean Method2(int j)
	{
		if(j>=14000 & j<20000)
		{
			return true; 
		}
		else 
		{
			return false; 
		}
	}

}
