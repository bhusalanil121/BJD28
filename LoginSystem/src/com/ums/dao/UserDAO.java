package com.ums.dao;

public interface UserDAO {
	void register();
	boolean verifyUserNmaeAndPassword(String email, String password);
	String getPassword(String email);
	

}
