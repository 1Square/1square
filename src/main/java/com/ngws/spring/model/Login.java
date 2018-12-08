package com.ngws.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Login")
public class Login {

	@Id
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
}
