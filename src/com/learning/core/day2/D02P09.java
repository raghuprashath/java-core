package com.learning.core.day2;

import java.util.Scanner;

public class D02P09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print((int)Math.pow(i, 3) + " ");//i*i*i
		}
	}
}
