package com.learning.core.day6;

import java.util.*;

public class PhoneBook {
	private long phoneNo;
	private String name;
	public PhoneBook(String name,long phoneNo) {
		this.phoneNo=phoneNo;
		this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
	}
	public String getName() {
		return name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public String toString() {
		return name+" "+phoneNo;
	}
}
