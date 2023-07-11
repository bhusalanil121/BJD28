package com.takeo;

import java.sql.SQLException;
import java.sql.Statement;

public class ProductUpdate {
	
	public void productUpdate() {
		Statement st = null;


		final String UPDATE_QUERY = "update product set price = 1500 where pid =100";
		try {
			st = SQLConnection.conn.createStatement();
			int count = st.executeUpdate(UPDATE_QUERY);
			if (count != 0) {
				System.out.println("Data Update sucessfull");
			} else {
				System.out.println("Data Update unsucessfull");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
