package com.learning.core.day3;

import java.util.Scanner;

public class D03P12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		if(s.length()>=8) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
}
