package com.takeo.Dao.Impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.takeo.Dao.userDao;
import com.takeo.QueryConstatnts.Queries;
import com.takeo.configuration.JDBUtility;
import com.takeo.model.User;

public class UserDaoImpl implements userDao {
	private Connection conn= null;
	private PreparedStatement ps = null;
	private ResultSet rs = null; 

	public int register(User user) {
		int count = 0;
		try {
			conn = JDBUtility.getConnection();
			ps = conn.prepareStatement(Queries.INSERT_QUERY);
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getUserName());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPassword());
			count = ps.executeUpdate();
			if(count != 0) {
				return 1;
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
		}finally {
			try {
				JDBUtility.connectionClose(conn, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}

	public boolean verifyUserNameAndPassword(String user, String pass) {
		try {
			conn = JDBUtility.getConnection();
			ps = conn.prepareStatement(Queries.VIEW_USER_QUERY);
			ps.setString(1, user);
			rs = ps.executeQuery();
			while(rs.next()) {
				String userName = rs.getNString(4);
				String password = rs.getNString(6);
				
				if(userName.equals(user) && password.equals(pass)) {
					return true;
				}

				
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
		}finally {
			try {
				JDBUtility.connectionClose(conn, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		return false;
	}

	public String forgotPassword(String user) {
		// TODO Auto-generated method stub
		try {
			conn = JDBUtility.getConnection();
			ps = conn.prepareStatement(Queries.VIEW_USER_QUERY);
			ps.setString(1, user);
			rs = ps.executeQuery();
			while(rs.next()) {
				String userName = rs.getString(4);
				String pass = rs.getString(6);
				if(userName.equals(user)) {
					return pass;
				}
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
		}finally {
			try {
				JDBUtility.connectionClose(conn, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
