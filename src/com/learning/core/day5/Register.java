package com.learning.core.day5;

import java.util.*;

public class Register<T>{
	T obj;
	String registerId;
	void Register() {
		
	}
	void Register(T obj) {
		this.obj=obj;
	}
	public String generateRegisterId(T obj) {
		Scanner sc=new Scanner(System.in);
		String regId=null;
		if(obj instanceof Employee || obj instanceof Student) {
			System.out.println("Enter the length of String");
			int n=sc.nextInt();
			String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvwxyz";
		    StringBuilder id= new StringBuilder(n);
		    for (int i = 0; i < n; i++) {
		           int index = (int)(AlphaNumericString.length() * Math.random());
		           id.append(AlphaNumericString.charAt(index));
		       }
		   regId= id.toString();
		}
		return regId;
	}
}
