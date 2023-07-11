package com.takeo.configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBUtility {
	private static Connection conn = null;
	public static Connection getConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Properties pr = new Properties();
		pr.load(new FileInputStream("/Users/anilbhusal/Desktop/Takeo/WebDevelopment/LogInManagementSystem/src/main/java/com/takeo/properties/app.properties"));
		Class.forName(pr.getProperty("dbClass"));
		conn = DriverManager.getConnection(pr.getProperty("dbUrl"), pr.getProperty("dbUser"), pr.getProperty("dbPassword"));
		return conn;
	}
	public static void connectionClose(Connection con, PreparedStatement ps) throws SQLException {
		if(con != null) {
			con.close();
		}
		if(ps != null) {
			ps.close();
		}
		
	}
	public static void connectionClose(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
		if(con != null) {
			con.close();
		}
		if(ps != null) {
			ps.close();
		}
		
		if(rs != null) {
			rs.close();
		}
		
	}

}
