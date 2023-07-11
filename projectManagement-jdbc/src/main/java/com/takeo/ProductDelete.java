package com.takeo;

import java.sql.SQLException;
import java.sql.Statement;

public class ProductDelete {
	public void productDelete() {
		Statement st = null;
		final String Delete_QUERY = "delete from product where pid=100";
		try {
			st = SQLConnection.conn.createStatement();
			int count = st.executeUpdate(Delete_QUERY);
			if (count != 0) {
				System.out.println("Data delete sucessfull");
			} else {
				System.out.println("Data delete unsucessfull");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
