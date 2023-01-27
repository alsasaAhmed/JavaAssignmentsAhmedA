package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class JukeBoxMain {

	ArrayList<JukeBox> al = new ArrayList<JukeBox>();
	
	public static void main(String[] args) {
		
			new UserAppMain().printUser();
			
			
		
		void printSongName() {
			getUsers();
			//Collections..sort(al, new ProjectComperator());
			for(Users us: al)
			{
				System.out.println(us);
			}
			
		}
		
		void getSongname()
		{
			File file = new File("jukebox.txt");
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line =null;
				while((line = br.readLine()) != null) {
					addUsers(line);
				}
			}	catch(Exception e) {
				
			}
			
		}
		
		
		void addSong(String linetoParse) {
			String[] tokens = linetoParse.split("/");
			Users users = new Users(tokens[0], tokens[1], tokens[2], tokens[3]);
			al.add(users);
		}

	}

}
