package com.ngws.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngws.spring.dao.LoginDAO;
import com.ngws.spring.model.Login;

@Service
public class LoginSeviceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;

	@Override
	public Login get(String userName) {
		return loginDAO.get(userName);
	}

	@Override
	public void update(String userName, Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Boolean insert(Login login) {
		return loginDAO.insert(login);
	}

}
