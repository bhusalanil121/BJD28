package com.takeo.model;

public class Student {
	private int sno;
	private String sname, sadd;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sno, String sname, String sadd) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}


	public int getSno() {
		return sno;
	}


	public String getSname() {
		return sname;
	}


	public String getSadd() {
		return sadd;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
	
	

}
