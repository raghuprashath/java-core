package com.learning.core.day2;

import java.util.Scanner;

public class D02P12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i = n; i >= 1; i--)
		    {
		        for(int j = i; j <n; j++)
		        {
		            System.out.print(" ");
		        }
		        for(int j = 1; j <= (2 * i - 1); j++)
		        {
		            System.out.print("*");
		        }
		        System.out.println("");
		    } 
	}
}
