package com.learning.core.day2;

import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Numbers");
		int num1=sc.nextInt(),num2=sc.nextInt();
		char operation=sc.next().charAt(0);
		switch(operation) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
