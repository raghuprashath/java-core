package com.learning.core.day5;

public class Student {
	String name;
	Long phoneNo;
	String passportNo;
	int licenseNo;
	String panCardNo;
	int voterId;
	void Student() {
		
	}
	void Student(String name,Long phoneNo,String passportNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.passportNo=passportNo;
	}
	void Student(String name,Long phoneNo,int licenseNo,String panCardNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.licenseNo=licenseNo;
		this.panCardNo=panCardNo;
	}
	void Student(String name,Long phoneNo,int voterId,int licenseNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.voterId=voterId;
		this.licenseNo=licenseNo;
	}
	@Override
	public String toString() {
		return name + " " + phoneNo + " " + passportNo + " "
				+ licenseNo + " " + panCardNo + " " + voterId;
	}
	
}
