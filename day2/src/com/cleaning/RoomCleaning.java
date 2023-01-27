package com.cleaning;

public class RoomCleaning implements Cleaning {
	
	public String preparingCleaning(String cleaningTaskName) {
		return "Cleaning the room" + cleaningTaskName + "extra clean"; 
	}

}
