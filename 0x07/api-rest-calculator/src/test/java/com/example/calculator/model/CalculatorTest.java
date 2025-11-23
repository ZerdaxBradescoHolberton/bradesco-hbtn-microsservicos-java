package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	private Double dn1 = 8.0;
	private Double dn2 = 4.0;
	private Integer fn1 = 4;
	private Integer bhn1 = 26;
	
	
	@Test
	void sumTest() {
		// TODO
		assertEquals(12.0, calculator.sum(dn1, dn2));
	}

	@Test
	public void numbersNullSumTest() {
		// TODO
		assertThrows(NullPointerException.class, () -> calculator.sub(null, dn2));
	}

	@Test
	void subTest() {
		// TODO
		assertEquals(4.0, calculator.sub(dn1, dn2));
	}

	@Test
	void divideTest() {
		// TODO
		assertEquals(2.0, calculator.divide(dn1, dn2));
	}

	@Test
	public void divisionByZeroTest() {
		// TODO
		assertThrows(ArithmeticException.class, () -> calculator.divide(dn1, 0d));
	}

	@Test
	void factorialTest() {
		// TODO
		assertEquals(24, calculator.factorial(fn1));
	}

	@Test
	void integerToBinaryTest() {
		// TODO
		assertEquals(11010, calculator.integerToBinary(bhn1));
	}

	@Test
	void integerToHexadecimalTest() {
		// TODO
		assertEquals("1a", calculator.integerToHexadecimal(bhn1));
	}

	@Test
	void calculeDayBetweenDateTest() {
		// TODO
		LocalDate date1 = LocalDate.of(2025, 11, 23);
		LocalDate date2 = LocalDate.of(2025, 11, 27);
		assertEquals(4, calculator.calculeDayBetweenDate(date1, date2));
	}
}