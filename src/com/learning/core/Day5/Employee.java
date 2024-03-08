package com.learning.core.day5;

public class Employee 
{  
	String name;
   long phoneNo;
   String passportNo;
   int licenseNo;
   String panCardNo;
   int voterid;
   int employeeid;
   
   public Employee(String name, long phoneNo, int licenseNo, int voterid, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.voterid = voterid;
		this.employeeid = employeeid;
	}
   public Employee(String name, long phoneNo, int licenseNo, String panCardNo, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
		this.employeeid = employeeid;
	}
   public Employee(String name, long phoneNo, String passportNo, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.passportNo = passportNo;
		this.employeeid = employeeid;
	}
	public String toString() {
		return  name + " " + phoneNo + " " + passportNo + " " + licenseNo
			+ " " + panCardNo + " " + voterid + " " + employeeid + super.toString();
	}

}