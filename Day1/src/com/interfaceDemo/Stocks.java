package com.interfaceDemo;

public interface Stocks {
	public void buyShares(); 
	public void sellShares();
	
	public default void viewShares() {
		System.out.println("Viewed Shares");
	}
}
