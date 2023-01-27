package com.day2assignment3;

public class SwitchCaseStatement {

	
	 public static void main(String[] args) {
	      
	      int score = 79;
	      String grade = "B";
	      
	      switch(score/10) {
	    
	        case 10:
	        case 9:
	           grade = "A";
	           break;
	        
	        case 8:
	           grade = "B";
	           break;
	      
	        case 7:
	           grade = "C";
	           break;
	       
	        case 6:
	           grade = "D";
	           break;
	       
	        case 5:
	           grade = "E";
	           break;
	     
	        default:
	           grade = "F";
	           break;
	      }
	     
	      System.out.println("Grade = " + grade);
	   }
}
