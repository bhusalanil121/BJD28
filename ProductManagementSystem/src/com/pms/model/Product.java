package com.pms.model;

public class Product {
	private int pid, qty, price;
	private String pname;
	
	
	
	public Product(int pid, int qty, int price, String pname) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.price = price;
		this.pname = pname;
	}
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getPid() {
		return pid;
	}
	public int getQty() {
		return qty;
	}
	public int getPrice() {
		return price;
	}
	public String getPname() {
		return pname;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	

}
