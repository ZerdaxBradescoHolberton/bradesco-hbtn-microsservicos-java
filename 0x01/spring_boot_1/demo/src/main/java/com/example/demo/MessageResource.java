package com.example.demo;

import static org.apache.commons.lang3.StringUtils.isBlank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class MessageResource {
	
	@GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome() {
     // TODO
		return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
    }

	@GetMapping("/login")
    public String login(
    		@RequestParam(name = "user", required = false) String user,
    		@RequestParam(name = "password", required = false) String password) {
	    if(isBlank(password) || isBlank(user))
	        return "USUÁRIO E SENHA NÃO INFORMADOS";
	    if(password.length() > 15 || user.length() > 15)
	        return "USUÁRIO E SENHA INVÁLIDOS";
	    return "LOGIN EFETUADO COM SUCESSO !!!";
    }

	
}
