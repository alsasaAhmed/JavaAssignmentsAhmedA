package com.model;

import java.util.Comparator;

public class ProjectComperator implements Comparator {

	@Override
	public int compare(Users o1, Users o2) {
		// TODO Auto-generated method stub
		return o1.getProject().compareTo(o2.getProject());
	}

	
	 
}
