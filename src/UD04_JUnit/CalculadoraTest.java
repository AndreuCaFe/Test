package UD04_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calcu = new Calculadora(20,10);
		assertEquals(30, calcu.suma());
	}

	@Test
	void testResta() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20,10);
		double resultado = calcu.resta();
		assertEquals(valorEsperado, resultado);
	}

	@Test
	void testMultiplica() {
		double valorEsperado = 200;
		Calculadora calcu = new Calculadora(20,10);
		double resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado);
	}

	@Test
	void testDivide() {
		double valorEsperado = 2;
		Calculadora calcu = new Calculadora(20,10);
		double resultado = calcu.divide();
		assertEquals(valorEsperado, resultado);
	}

}
