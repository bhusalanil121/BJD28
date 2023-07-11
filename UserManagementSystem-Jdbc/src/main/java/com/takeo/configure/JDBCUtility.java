package com.takeo.configure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtility {
	private static Connection conn = null;

	public static Connection getConnection()
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Properties pro = new Properties();

		pro.load(new FileInputStream("com/takeo/properties/app.properties"));
		// register driver
		Class.forName(pro.getProperty("dbClass"));
		// make connection
		conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("dbUname"),
				pro.getProperty("dbPassword"));

		return conn;
	}

	public static void closeConnectio(Connection conn, PreparedStatement ps) throws SQLException {
		if (ps != null) {
			ps.close();
		}
		if (conn != null) {
			conn.close();
		}

	}

	public static void closeConnectio(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
		if (ps != null) {
			ps.close();
		}
		if (conn != null) {
			conn.close();
		}
		if (rs != null) {
			rs.close();
		}

	}

}
