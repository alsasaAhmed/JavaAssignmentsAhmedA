package com.model;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.util.Comparator;

public class UserAppMain {

	ArrayList<Users> al = new ArrayList<Users>();
	public static void main(String[] args) {
		new UserAppMain().printUser();
		
		
	}
	void printUser() {
		getUsers();
		//Collections..sort(al, new ProjectComperator());
		for(Users us: al)
		{
			System.out.println(us);
		}
		
	}
	
	void getUsers()
	{
		File file = new File("user.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line =null;
			while((line = br.readLine()) != null) {
				addUsers(line);
			}
		}	catch(Exception e) {
			
		}
		
	}
	
	
	void addUsers(String linetoParse) {
		String[] tokens = linetoParse.split("/");
		Users users = new Users(tokens[0], tokens[1], tokens[2], tokens[3]);
		al.add(users);
	}

}
