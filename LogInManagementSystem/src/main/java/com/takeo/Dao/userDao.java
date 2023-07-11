package com.takeo.Dao;

import com.takeo.model.User;

public interface userDao {
	int register(User user);
	boolean verifyUserNameAndPassword(String user, String pass);
	String forgotPassword(String user);
	
}
