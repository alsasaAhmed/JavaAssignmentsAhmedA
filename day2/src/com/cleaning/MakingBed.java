package com.cleaning;

public class MakingBed implements Cleaning {
	
	public String preparingCleaning(String cleaningTaskName) {
		return "Making the bed" + cleaningTaskName + "extra clean"; 
	}

}
