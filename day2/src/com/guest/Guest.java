package com.guest;

import com.restaurant.AmericanRestaurant; 
import com.restaurant.IndianRestaurant;
import com.roomservice.RoomService;
import com.cleaning.MakingBed;
import com.cleaning.RoomCleaning;
import com.factory.RestaurantFactory;

public class Guest {

	public static void main(String[] args) {
		RoomService roomService = new RoomService(RestaurantFactory.createObject('a'), new MakingBed());
		
		
		System.out.println(roomService.placeOrder("fries with fish"));
		
		//System.out.println(roomService.placeCleaning("tons of cleaning"));
		
		

	}

}
