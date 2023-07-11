package com.pms.admin.dao;

import java.util.*;

import com.pms.model.User;

public interface CustomerDAO {
	public void addCustomer();

	public List<User> viewAllUserInfo();

	public User viewUserInfo(int id);

	public void deleteUser(int id);

	public void updateUser(int id);

}
