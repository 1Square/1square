package com.ngws.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ngws.spring.model.Login;
import com.ngws.spring.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	//Insert user credentials
	@PostMapping("/register")
	public ResponseEntity<?> insert(@RequestBody Login login) {
		
		System.out.println("the json value of login is :::::: "+login);
		Boolean result = loginService.insert(login);
		return ResponseEntity.ok().body("New user credentials has been created successfuly" + result);
		   
	}
	
	@GetMapping("/login/{userName}")
	public ResponseEntity<Login> get(@PathVariable("userName") String userName){
		Login login = loginService.get(userName);
		return ResponseEntity.ok().body(login);
		
	}

}

