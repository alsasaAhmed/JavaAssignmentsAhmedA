package com.interfaceDemo;

public class JPMC implements Bank, Insurance, Stocks {

	@Override
	public void buyInsurance() {
		System.out.println("Bought insurance");
	}

	@Override
	public void claimInsurance() {
		System.out.println("Claimed insurance");
	}

	@Override
	public void deposit() {
		System.out.println("Deposited in bank");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrew from bank");
	}

	@Override
	public void buyShares() {
		System.out.println("Purchased stock");
	}

	@Override
	public void sellShares() {
		System.out.println("Sold stock");
	}

}
