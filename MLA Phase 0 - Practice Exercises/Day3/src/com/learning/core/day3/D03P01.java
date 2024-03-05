package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		System.out.println("The length of String is " +s.length());
		System.out.println("The Uppercase "+s.toUpperCase());
		if(ispalindrome(s)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}
	public static boolean ispalindrome(String s) {
		int n=s.length();
		int j=n-1;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)==s.charAt(j)) {
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
