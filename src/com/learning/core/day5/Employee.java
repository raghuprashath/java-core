package com.learning.core.day5;

public class Employee {
	String name;
	String passportNo;
	long phoneNo;
	int licenseNo;
	String panCardNo;
	int voterId;
	int employeeId;
	public Employee(String name, long phoneNo, int employeeId, String passportNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.employeeId=employeeId;
		this.passportNo=passportNo;
	}
	void Employee(String name,long phoneNo,int employeeId,int licenseNo,String panCardNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.employeeId=employeeId;
		this.licenseNo=licenseNo;
		this.panCardNo=panCardNo;
	}
	void Employee(String name,long phoneNo,int employeeId,int voterId,int licenseNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.employeeId=employeeId;
		this.voterId=voterId;
		this.panCardNo=panCardNo;
	}
	@Override
	public String toString() {
		return  name + " " + passportNo + " " + phoneNo + "  "
				+ licenseNo + " " + panCardNo + " " + voterId + " " + employeeId;
	}
	
}