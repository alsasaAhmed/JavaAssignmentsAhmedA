package assignments2;

public class UserType {
	
	//Day 2 Assignemnt 6
	
		String name;
		
		UserType(String parameterVal)
		{
			name = parameterVal;
		}
		
		UserType()
		{
			this("student");
		}
		
		public static void main(String args[])
		{
			UserType usertype1 = new UserType("Faculty");
			UserType usertype2 = new UserType();
			
			
			System.out.println(usertype1.name);
			System.out.println(usertype2.name);
			
		}
		

}
