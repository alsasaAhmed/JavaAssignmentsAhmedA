package com.exception;



public class Bank {

	public static void main(String[] args) {
	
	

}

	double Balance = 1000;
	
	
	
	
	 
	
	public double withdraw(double withdrawnamount) 
	{
		double Withdrawnamount = 0; 
		return this.Balance -= Withdrawnamount; 
	}
	
	public double deposit(double depositamount) 
	{
		double Depositdrawnamount = 0; 
		
		 return this.Balance += Depositdrawnamount; 
	}
	
	public double checkbalanace(double balance)
	{
		double balanace = 0; 
		
		this.Balance = balance; 
		
		System.out.println("You have" + balanace + "in your account" );
		
		return balanace;
				
	}
	
	
}
