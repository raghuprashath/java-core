package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two elements in range 1 to 40 ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		if(isBingo(arr,num1)&&isBingo(arr,num2)) {
			System.out.println("Its Bingo");
		}
		else {
			System.out.println("Not Found");
		}
	}
	public static boolean isBingo(int[] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
}
