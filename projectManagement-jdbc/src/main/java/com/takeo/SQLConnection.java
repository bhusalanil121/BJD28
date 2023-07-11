package com.takeo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	public static Connection conn;
	public static void sqlConnection() {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create connection
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/productManagement?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "rootroot");
			if (conn != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Connection Established");
			}

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
