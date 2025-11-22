package com.example.calculator.model;

import static java.util.Objects.isNull;

import java.time.LocalDate;
import java.util.List;

public class Calculator {

	public Double sum(Double number1, Double number2) {
		// TODO
		// validação -> throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
		validacaoNulo(number1, number2);
		return number1 + number2;
	}

	public Double sub(Double number1, Double number2) {
		// TODO
		// validação -> throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
		validacaoNulo(number1, number2);
		return number1 - number2;
	}

	public Double divide (Double number1, Double number2)  {
		// TODO
		// validação -> throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
		// validação -> throw new ArithmeticException("Divisão por zero não é permitido.");
		validacaoNulo(number1, number2);
		try {
			return number1 / number2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ArithmeticException("Divisão por zero não é permitido.");
		}
	}

	public Integer factorial(Integer factorial) {
		// TODO
		// validação -> throw new NullPointerException("Número é obrigatório.");
		if(factorial <= 1)
			return 1 ;
		else
			return factorial * factorial(factorial - 1);
	}

	// Exemplos:
	// Integer = 1 -> Binary = 1
	// Integer = 5 -> Binary = 101
	// Integer = 20 -> Binary = 10100
	public Integer integerToBinary(Integer integer) {
		// TODO
		return Integer.parseInt(Integer.toBinaryString(integer));
	}   

	// Exemplos:
	// Integer = 1 -> Hexadecimal = "1"
	// Integer = 5 -> Hexadecimal = "37"
	// Integer = 170 -> Binary = "AA"
	public String integerToHexadecimal(Integer integer) {
		// TODO
		return Integer.toHexString(integer);
	}

	// Exemplos
	// Date 1 = LocalDate.of(2020, 3, 15);
	// Date 2 = LocalDate.of(2020, 3, 29)
	// Total de dias = 14 
	public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
		// TODO
		return (int) Math.abs(date1.toEpochDay() - date2.toEpochDay());
	}
	
	private void validacaoNulo(Double n1, Double n2) {
		if(isNull(n1) || isNull(n2)) throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
	}
	
}