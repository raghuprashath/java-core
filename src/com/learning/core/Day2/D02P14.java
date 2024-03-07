package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and power");
		int base=sc.nextInt();
		int power=sc.nextInt();
		int res=1;
		while(power!=0) {
			res=res*base;
			power--;
		}
		System.out.println(res);
	}
}
