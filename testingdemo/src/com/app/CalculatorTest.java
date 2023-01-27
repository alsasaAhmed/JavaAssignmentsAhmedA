package com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	int a; 
	static Calculator cal = null;
	@BeforeAll
	public static void callOnceOnly() {
		System.out.println("called only once before all test cases");
		
		cal = new Calculator();
		
	}
	
	@BeforeEach
	public void callBefore() {
		a=10; 
		System.out.println("called before with value" + 10);
	}
	
	@AfterEach
	public void callAfter() {
		System.out.println("called after");
	}
	
	
	@Test
	void testAdd() {
		
		System.out.println("insde add function the value is " + a);
		
		++a;
		
		assertEquals(20, cal.add(15, 5));
		
		System.out.println("Value updated in add function and now value is " + a);
	}
	
	@Test 
	void testSub() { 
		
		System.out.println("inside sub function the value is " + a);
		
		--a;
		
		assertEquals(20, cal.substract(5, 15));
		
		System.out.println("Value updated in sub function and now value is " + a);
		
	}

}
