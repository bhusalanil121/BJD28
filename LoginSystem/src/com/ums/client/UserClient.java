package com.ums.client;

import com.ums.dao.impl.*;
import java.util.*;

public class UserClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserDAOImpl udao = new UserDAOImpl();

		while (true) {
			System.out.println("====================================================");
			System.out.println("                     1) Register");
			System.out.println("                     2) Customer Login");
			System.out.println("                     3) Forgot Password");
			System.out.println("                     4) Exit");
			System.out.println("====================================================");

			System.out.print("Please enter your option here: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				udao.register();
				break;
			case 2:
				System.out.print("Enter email: ");
				String mail = sc.next();
				System.out.print("Enter password: ");
				String pass = sc.next();
				if (udao.verifyUserNmaeAndPassword(mail, pass)) {
					System.out.println("Login SucessFull!!!");
				} else {
					System.out.println("Invalid User!!!");
				}
				break;
			case 3:
				System.out.print("Enter your email to retrive password: ");
				String mail1 = sc.next();
				String password = udao.getPassword(mail1);
				if (password != null) {
					System.out.println("Your password: " + password);
				}else {
					System.out.println("You enterd wrong id");
				}

				break;
			case 4:
				System.out.println("Thanks for using app!!!");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter option between 1-4!!!");

			}

		}

	}

}
