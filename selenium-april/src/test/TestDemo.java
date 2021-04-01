package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calc.Calculator;

class TestDemo {
	
	private static Calculator calculator = new Calculator();

	@Test
	void testAdditionHappyPath() {
		int a = 5;
		int b = 7;
		int result = calculator.add(a, b);
		//assertTrue(result==12);
		assertEquals(result,12);
	}
	
	@Test
	void testAddingTwoEnormousNumbers() {
		int a = 2000000000;
		int b = 2000000000;		
		int result = calculator.add(a, b);
		assertEquals(result, Integer.parseInt("4000000000"));
	}
	
	@Test
	void testAddionWithZero() {
		int a = 5;
		int b = 0;
		int result = calculator.add(a, b);
		//assertTrue(result==12);
		assertEquals(result,5);
	}
	
	@Test
	void testAdditionWithANegativeNumber() {
		int a = 5;
		int b = -7;
		int result = calculator.add(a, b);
		//assertTrue(result==12);
		assertEquals(result,-2);
	}
	
	@Test
	void testSubtractionHappyPath() {
		int a = 7;
		int b = 6;
		int result = calculator.subtract(a, b);
		//assertTrue(result==12);
		assertEquals(result, 1);
	}
	
	@Test
	void testSubtractionWhenResultIsNegative() {
		int a = 6;
		int b = 7;
		int result = calculator.subtract(a, b);
		assertEquals(result, -1);
	}

}
