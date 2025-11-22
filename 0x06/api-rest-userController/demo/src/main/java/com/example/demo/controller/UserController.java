package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.CPFException;
import com.example.demo.exception.ExceptionService;
import com.example.demo.exception.UserIdException;
import com.example.demo.exception.UserNameException;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private ExceptionService exceptionService;

	@GetMapping("/user-id/{id}")
	public String findUserById(@PathVariable int id) {

		if(!isValidUserId(id)) throw new UserIdException("You have entered invalid ID");
		String msg = "You have entered valid ID";
		// TODO
		return msg;
	}

	@GetMapping("/user-name/{userName}")
	public String findUserByName(@PathVariable String userName) {

		String msg = "You have entered valid USERNAME";
		// TODO
		if(!isValidUserName(userName)) throw new UserNameException("You have entered invalid USERNAME");
		return msg;
	}

	@GetMapping("/user-cpf/{cpf}")
	public String findUserByCPF(@PathVariable String cpf) {

		String msg = "You have entered valid CPF";
		boolean isCPFValid = isCPF(cpf);
		if(!isCPFValid) throw new CPFException("You have entered invalid CPF");
		// TODO
		return msg;

	}

	public boolean isCPF(String CPF) {
		// TODO
		return CPF.length() > 3 && CPF.length() < 15;
	}
	
	public boolean isValidUserId(int userId) {
		// TODO
		return userId > 0 && userId < 100;
	}
	
	public boolean isValidUserName(String userName) {
		// TODO
		return userName.length() > 3 && userName.length() < 15;
	}
	
}
