package com.learning.core.day3;

import java.util.Scanner;

public class D03P09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size ");
		int n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("Enter the String Values");
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		if(cycleornot(s)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static boolean cycleornot(String[] s) {
		for(int i=0;i<s.length;i++) {
			String y=s[i];
			for(int j=i+1;j<s.length;j++) {
				return true;
			}
		}
		return false;
	}

}
