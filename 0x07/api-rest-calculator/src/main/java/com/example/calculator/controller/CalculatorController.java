package com.example.calculator.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.model.Calculator;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
	
	private Calculator calculator = new Calculator();

	@GetMapping("/welcome")
	public String messageWelcome() {
		// TODO
		return "Bem vindo à CALCULATOR API REST.";
	}

	@GetMapping("/addNumbers")
	public String addNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
		// TODO
		return String.format("%.1f", calculator.sum(n1, n2));
	}

	@GetMapping("/subNumbers")
	public String subNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
		// TODO
		return String.format("%.1f", calculator.sub(n1, n2));
	}

	@GetMapping("/divideNumbers")
	public String divideNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
		// TODO
		return String.format("%.1f", calculator.divide(n1, n2));
	}

	@GetMapping("/factorial")
	public String factorial(@RequestParam(name = "factorial") Integer factorial) {
		// TODO
		return String.format("%d", calculator.factorial(factorial));
	}

	@GetMapping("/calculeDayBetweenDate")
	public String calculeDayBetweenDate(
			@RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
			@RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {
		// TODO
		return String.format("%s", calculator.calculeDayBetweenDate(localDate1, localDate2));
	}

	@GetMapping("/integerToBinary")
	public String integerToBinary(@RequestParam(name = "number1") Integer n1) {
		// TODO
		return String.format("%d", calculator.integerToBinary(n1));
	}

	@GetMapping("/integerToHexadecimal")
	public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
		// TODO
		return String.format("%d", calculator.integerToHexadecimal(n1));
	}
}