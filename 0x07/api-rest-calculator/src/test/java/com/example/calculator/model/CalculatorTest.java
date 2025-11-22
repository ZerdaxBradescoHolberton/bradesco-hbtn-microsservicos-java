package com.example.calculator.model;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	@Test
	void sumTest() {
		// TODO
	}

	@Test
	public void numbersNullSumTest() {
		// TODO
	}

	@Test
	void subTest() {
		// TODO
	}

	@Test
	void divideTest() {
		// TODO
	}

	@Test
	public void divisionByZeroTest() {
		// TODO
	}

	@Test
	void factorialTest() {
		// TODO
		System.out.println(calculator.factorial(15));
	}

	@Test
	void integerToBinaryTest() {
		// TODO
	}

	@Test
	void integerToHexadecimalTest() {
		// TODO
	}

	@Test
	void calculeDayBetweenDateTest() {
		// TODO
		LocalDate date1 = LocalDate.of(2024, 11, 22);
		LocalDate date2 = LocalDate.of(2026, 11, 22);
		
		System.out.println(Math.abs(date1.toEpochDay() - date2.toEpochDay()));
	}
}