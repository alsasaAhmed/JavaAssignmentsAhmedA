package com.day1;

public class UserMain {
	public static void main(String args[]) {
		User user = new User();
		
		user.setUserId(Integer.parseInt(args[0]));
		user.setUsername(args[1]);
		user.setUserEmail(args[2]);
		
		System.out.println(user.getUserId() + " " + user.getUsername() + " "
				+ user.getUserEmail());
		
		/*User user2 = new User();
		
		System.out.println(user.hashCode() + " " + user2.hashCode());
		
		user2 = user;
		
		System.out.println(user.hashCode() + " " + user2.hashCode());
		
		//garbage collector takes care of user2's original object reference
		
		user.setUserId(101);
		user.setUserEmail("john@gmail.com");
		user.setUsername("John");*/
		
		//user = null;
		//user reference is not needed anymore - null error when trying to use again
		
		//System.out.println(user.getUsername() + " " + user.getUserEmail());
	}
}
 