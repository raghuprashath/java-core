package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.print(a+","+b);
		for(int i=0;i<n-2;i++) {
			System.out.print(",");
			c=a+b;
		 	System.out.print(c);
			a=b;
			b=c;
		}
	}
}
