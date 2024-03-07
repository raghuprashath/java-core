package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int fact=1;
		if(n==0) {
			System.out.println("1");
		}
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}
}
