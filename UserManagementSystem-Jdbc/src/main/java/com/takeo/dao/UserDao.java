package com.takeo.dao;

import java.util.List;

import com.takeo.model.User;

public interface UserDao {
	
	public String register(User user);
	public List<User> viewRegister();
	public boolean verifyEmailPassword(String email, String pass);
	
	
	

}
