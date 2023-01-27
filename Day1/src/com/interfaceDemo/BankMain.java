package com.interfaceDemo;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = new HSBC();
		bank.deposit();
		
		Insurance insurance = new JPMC();
		insurance.buyInsurance();
		
		Stocks shares = new JPMC();
		shares.buyShares();
		shares.viewShares();
		
		insurance.checkValue(); 
		insurance.buyInsurance(); 
	}

}
