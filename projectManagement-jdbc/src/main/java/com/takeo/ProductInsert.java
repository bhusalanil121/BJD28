package com.takeo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInsert {
	public void productInsert() {
		Statement st = null;
		final String INSERT_QUERY = "insert into product values(100, 'anil', 10, 1000)";
		try {
			st = SQLConnection.conn.createStatement();
			int count = st.executeUpdate(INSERT_QUERY);
			if (count != 0) {
				System.out.println("Data insertion sucessfull");
			} else {
				System.out.println("Data insertion unsucessfull");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
