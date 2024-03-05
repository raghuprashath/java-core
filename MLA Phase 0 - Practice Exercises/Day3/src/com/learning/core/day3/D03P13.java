package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println(replacespace(s));
	}
	public static String replacespace(String s) {
		StringBuilder res=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(c==' ') {
				res.append("%20");
			}
			else {
				res.append(c);
			}
		}
		return res.toString();
	}

}
