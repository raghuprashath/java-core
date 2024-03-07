package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		System.out.println("Enter the count");
		int n=sc.nextInt();
		Mismatch(s,n);
	}
	public static void Mismatch(String s,int n) {
		StringBuilder x=new StringBuilder("");
		int count=0;
		for(char c:s.toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count+=1;
				x.append(c);
			}
		}
		if(count>n) {
			System.out.println("Mismatch");
		}
		else {
			System.out.println(x.toString());
		}
	}
}
