package com.ngws.spring.service;

import com.ngws.spring.model.Login;

public interface LoginService {
	
	//Get a single record 
	Login get(String userName);
	
	//Update record
	void update(String userName, Login login);
	
	//Delete a record
	void delete(String userName);
	
	//Insert a record
	void insert(Login login);
}
