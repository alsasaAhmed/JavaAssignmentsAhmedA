package com.interfaceDemo;

public interface Insurance {
	public void buyInsurance();
	public void claimInsurance();
	
	public default void checkValue() {
		System.out.println("insurance value check");
	}
}
