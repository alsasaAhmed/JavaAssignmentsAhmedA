package com.factory;

import com.restaurant.Restaurant; 
import com.restaurant.AmericanRestaurant;
import com.restaurant.IndianRestaurant;

public class RestaurantFactory {
	
	public static Restaurant createObject(char type) {

	switch(type) {
	
	case 'i': return new IndianRestaurant(); 
	case 'a': return new AmericanRestaurant(); 
	}
	return null; 
	
	}
}
