package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digits");
		int digits=sc.nextInt();
		int rev=0;
		while(digits>0) {
			int x=digits%10;
			rev=(rev*10)+x;
			digits/=10;
		}
		System.out.println(rev);
	}
}
