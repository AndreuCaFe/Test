package UD04_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FarenheitCelsiusTest {

	@Test
	void testCelsiusToFarenheit() {
		FarenheitCelsius num = new FarenheitCelsius();
		double celsius = num.CelsiusToFarenheit(-5);
		assertEquals(23,celsius);
	}
	
	@Test
	void testCelsiusToFarenheit2() {
		FarenheitCelsius num = new FarenheitCelsius();
		double celsius = num.CelsiusToFarenheit(0);
		assertEquals(32,celsius);
	}
	
	@Test
	void testCelsiusToFarenheit3() {
		FarenheitCelsius num = new FarenheitCelsius();
		double celsius = num.CelsiusToFarenheit(15);
		assertEquals(59,celsius);
	}

	@Test
	void testCelsiusToFarenheit4() {
		FarenheitCelsius num = new FarenheitCelsius();
		double celsius = num.CelsiusToFarenheit(32);
		assertEquals(89,6,celsius);
	}
	
	// Farenheit to Celsius
	@Test
	void testFarenheitToCelsius() {
		FarenheitCelsius num = new FarenheitCelsius();
		double celsius = num.FarenheitToCelsius(-5);
		assertEquals(-21,celsius);
		
		celsius = num.FarenheitToCelsius(0);
		assertEquals(-18, celsius);
		
		celsius = num.FarenheitToCelsius(15);
		assertEquals(-9, celsius);
		
		celsius = num.FarenheitToCelsius(32);
		assertEquals(0, celsius);
		
		
	}
	

}
