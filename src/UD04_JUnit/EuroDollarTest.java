package UD04_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EuroDollarTest {

	@Test
	void testDollar2Euro() {
		EuroDollar num = new EuroDollar();
		double euro = num.dollar2Euro(10.5);
		assertEquals(9.68,euro);
	}

	@Test
	void testEuro2Dollar() {
		EuroDollar num = new EuroDollar();
		double dollar = num.euro2Dollar(20.20);
		assertEquals(21.90,dollar);
	}

}
