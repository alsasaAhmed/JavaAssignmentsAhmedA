package com.roomservice;

import com.restaurant.Restaurant; 

import com.cleaning.Cleaning; 

public class RoomService {

	private Restaurant restaurant;
	
	private Cleaning cleaning; 

	public RoomService(Restaurant restaurant, Cleaning cleaning) {
		super();
		this.restaurant = restaurant;
		this.cleaning = cleaning; 
	}
	
	
	
	
	public String placeOrder(String orderName) {
		return restaurant.prepareDish(orderName); 
	}
	
	public String placeCleaning(String cleaningName )
	{
		return cleaning.preparingCleaning(cleaningName); 
	}
	
	
	
}
