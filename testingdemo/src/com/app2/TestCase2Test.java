package com.app2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase2Test {

	@Test
	void testMultiplyTest() {
		assertEquals(30 , new TestCase2().multiplyTest(15, 2));
	}

}
