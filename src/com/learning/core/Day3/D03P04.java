package com.learning.core.day3;

import java.util.Scanner;

public class D03P04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(firstrepeatindex(arr));
	}
	public static int firstrepeatindex(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return j;
				}
			}
		}
		return arr.length-1;
	}
}
