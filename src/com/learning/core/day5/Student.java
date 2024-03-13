package com.learning.core.day5;

public class Student {
	String name;
	long phoneNo;
	String passportNo;
	int licenseNo;
	String panCardNo;
	int voterId;
	
	void Student(String name,long phoneNo,String passportNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.passportNo=passportNo;
	}
	public Student(String name, long phoneNo, int i, String panCardNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.licenseNo=licenseNo;
		this.panCardNo=panCardNo;
	}
	void Student(String name,long phoneNo,int voterId,int licenseNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.voterId=voterId;
		this.licenseNo=licenseNo;
	}
	public String toString() {
		return name + " " + phoneNo + " " + passportNo + " "
				+ licenseNo + " " + panCardNo + " " + voterId;
	}
	
}