package com.learning.core.day9;

import java.util.Scanner;

public class D09P03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to Search");
		int element=sc.nextInt();
		if(isPresent(arr,element)) {
			System.out.println("Element is Present");
		}
		else {
			System.out.println("Element is not Present");
		}
	}
	public static boolean isPresent(int[] arr,int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return true;
			}
			else {
				continue;
			}
		}
		return false;
	}
}
