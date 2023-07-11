package oop2;

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(int empId, double sal, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode) {
		super(empId, sal, basic, allowance, deductions, firstName, lastName, address, pincode);
		// TODO Auto-generated constructor stub
	}
	
	public double CalcSalary() {
		double Sal= (getBasic()/2) + getAllowance() - getDeductions();
		return Sal;
	}
	

}
