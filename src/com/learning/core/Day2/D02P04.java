package com.learning.core.day2;

import java.util.Scanner;

public class D02P04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1);
		}
		else if(num2>num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
	}
}
