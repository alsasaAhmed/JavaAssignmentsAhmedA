package com.interfaceDemo;

public class HSBC implements Bank {

	@Override
	public void deposit() {
		System.out.println("Deposited in bank");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrew from bank");
	}

}
