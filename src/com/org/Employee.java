package com.org;

public class Employee {
	int employeeid;
	String Employeename;
	String Employeedesignation;
	
	
	public Employee(int employeeid,String Employeename, String employeedesignation) {
	
		super();
	this.employeeid=employeeid;
	this.Employeename=Employeename;
		this.Employeedesignation= employeedesignation;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", Employeename=" + Employeename + ", Employeedesignation="
				+ Employeedesignation + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
