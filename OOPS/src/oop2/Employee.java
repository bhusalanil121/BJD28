package oop2;

public class Employee {
	private int EmpId;
	private double Sal = 0;
	private double Basic, Allowance, Deductions;
	private String FirstName, LastName, Address, Pincode;
	
	public Employee(int empId, double sal, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode) {
		EmpId = empId;
		Sal = sal;
		Basic = basic;
		Allowance = allowance;
		Deductions = deductions;
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Pincode = pincode;
	}
	
	
	public String realname() {
		String realname = FirstName + LastName;
		if (realname.length() <1) {
			return "Both First name and last name cannot be empty!!! ";
		}
		return realname;
	}
	
	public double CalcSalary() {
		Sal= Basic + Allowance - Deductions;
		return Sal;
	}
	
	
	public int getEmpId() {
		return EmpId;
	}
	public double getSal() {
		return Sal;
	}
	public double getBasic() {
		return Basic;
	}
	public double getAllowance() {
		return Allowance;
	}
	public double getDeductions() {
		return Deductions;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getAddress() {
		return Address;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	public void setBasic(double basic) {
		Basic = basic;
	}
	public void setAllowance(double allowance) {
		Allowance = allowance;
	}
	public void setDeductions(double deducions) {
		Deductions = deducions;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	
	

}
