package com.takeo.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.takeo.configure.JDBCUtility;
import com.takeo.model.User;
import com.takeo.query.QueryConstants;

public class UserDaoImpl implements UserDao {
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	String msg = "";

	public String register(User user) {
		// TODO Auto-generated method stub
		try {
			conn = JDBCUtility.getConnection();
			ps = conn.prepareStatement(QueryConstants.USER_INSERT_QUERY);

			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getUserName());
			ps.setString(5, user.getPassword());

			int count = ps.executeUpdate();
			if (count != 0) {
				msg = "User Registration sucessfull";
			} else {
				msg = "User Registration unsucessfull";
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				JDBCUtility.closeConnectio(conn, ps);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return msg;
	}

	public List<User> viewRegister() {
		// TODO Auto-generated method stub
		List<User> addUser = new ArrayList<User>();

		try {
			conn = JDBCUtility.getConnection();

			ps = conn.prepareStatement(QueryConstants.USER_SELECT_QUERY);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String email = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);

				User user = new User(id, fname, lname, email, username, password);
				addUser.add(user);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				JDBCUtility.closeConnectio(conn, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return addUser;
	}

	public boolean verifyEmailPassword(String email, String pass) {
		// TODO Auto-generated method stub
		boolean flag = false;

		try {
			conn = JDBCUtility.getConnection();
			ps = conn.prepareStatement(QueryConstants.USER_VALID_QUERY);

			ps.setString(1, email);
			ps.setString(2, pass);

			rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;

	}

}
