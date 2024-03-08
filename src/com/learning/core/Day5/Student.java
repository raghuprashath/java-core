package com.learning.core.day5;

public class Student
{ 
  String name;
  long phoneno;
  String passportNo;
  int licenseNo;
  String panCardNo;
  int voterid;
  
  public Student(String name, long phoneno, int licenseNo, int voterid) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.licenseNo = licenseNo;
		this.voterid = voterid;
	}
  public Student(String name, long phoneno, int licenseNo, String panCardNo) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
	}
   public Student(String name, long phoneno, String passportNo) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.passportNo = passportNo;
	}
   public String toString() {
	   	return name + " " + phoneno + " " + passportNo + " " + licenseNo
			+ " " + panCardNo + " " + voterid + " " + getClass() + " "
			+ hashCode() + " " + super.toString() + "]";
   }	

}