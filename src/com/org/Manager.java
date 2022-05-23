package com.org;

public class Manager extends Employee {
     
	
		
		int managerid;
		 public Manager(int employeeid,String Employeename, String employeedesignation,int managerid) {
				
				super(employeeid,Employeename,employeedesignation);
				
			    this.managerid=managerid;
			    
		}
		@Override
		public String toString() {
			return "Manager [managerid=" + managerid + ", employeeid=" + employeeid + ", Employeename=" + Employeename
					+ ", Employeedesignation=" + Employeedesignation + "]";
		}
		
		
	}


