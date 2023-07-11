package com.takeo.QueryConstatnts;

public interface Queries {
	public String INSERT_QUERY = "insert into User(fname, Lname, uname, email, password) values(?,?,?,?,?)";
	public String VIEW_USER_QUERY = "select * from User where uname=?";
	
	

}
