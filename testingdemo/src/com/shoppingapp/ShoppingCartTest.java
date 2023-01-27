package com.shoppingapp;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

	private static ShoppingCart cart; 
	
	private Product book1; 
	
	private Product book2; 
	
	@BeforeAll
	private static void callBefore() {
		cart = new ShoppingCart();
		
		
	}
	@BeforeEach
	public void callBeforeTest() {
		book1 = new Product("Java Book", 100);
		book2 = new Product("oracle Book", 200);
		cart.addItem(book1);
		cart.addItem(book2);
		cart.removeProduct(book1);
	}
	@Test
	public void testAdd() {
		Product p3 = new Product("mobile", 445);
		cart.addItem(p3);
		assertEquals(3, cart.getItemCount());
	}
	
	public void testCheckBalance() {
		Product p3 = new Product("mobile", 445);
		cart.addItem(p3);
		double expectedBalance = book1.getPrice()+book2.getPrice()+p3.getPrice();
		//assertEquals(expectedBalance, cart.getBalance());
		assertEquals(expectedBalance, cart.getBalance());
		
	}
	
	/*@Test 
	public void testRemove()
	{
		 
		cart.removeProduct(book1);
		assertEquals(1, cart.getItemCount());
	}
	*/
	
}
