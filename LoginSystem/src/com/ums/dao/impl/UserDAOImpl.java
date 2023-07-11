package com.ums.dao.impl;

import java.util.*;

import com.ums.dao.UserDAO;
import com.ums.model.*;

public class UserDAOImpl implements UserDAO {
	Scanner sc = new Scanner(System.in);

	List<User> addUser = new ArrayList<User>();

	@Override
	public void register() {
//		int userId, String firstName, String lastName, String email, String password, String dateofJoining
		System.out.print("Enter the user ID: ");
		int userId = sc.nextInt();
		System.out.print("Enter the first name: ");
		String firstName = sc.next();
		System.out.print("Enter the last name: ");
		String lastName = sc.next();
		System.out.print("Enter the Email: ");
		String email = sc.next();
		System.out.print("Enter the Password: ");
		String password = sc.next();
		System.out.print("Enter the Date of Joining: ");
		String dateofJoining = sc.next();

		User user = new User(userId, firstName, lastName, email, password, dateofJoining);

		// Adding user to our Array list
		addUser.add(user);
		System.out.println("User Added Sucessfully");

	}

	@Override
	public boolean verifyUserNmaeAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		for (User user : addUser) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return true;
			}

		}
		return false;
	}

	@Override
	public String getPassword(String email) {
		// TODO Auto-generated method stub
		for (User user : addUser) {
			if (user.getEmail().equals(email)) {
				return user.getPassword();
			}

		}
		return null;
	}

}
