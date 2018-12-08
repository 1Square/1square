package com.ngws.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ngws.spring.model.Login;

@Repository
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	private SessionFactory sessionFactory; 

	@Override
	public Login get(String userName) {
		return sessionFactory.getCurrentSession().get(Login.class, userName);
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
	public Boolean insert(Login login) {
		Boolean result = (Boolean) sessionFactory.getCurrentSession().save(login);		
		return result;
	}
	
}
