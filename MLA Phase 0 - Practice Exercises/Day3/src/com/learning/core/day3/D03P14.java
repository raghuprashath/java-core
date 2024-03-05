package com.learning.core.day3;

import java.util.Scanner;

public class D03P14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Array Size");
		int n=sc.nextInt();
		int arr1[]= new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the Second Array Size");
		int m=sc.nextInt();
		int arr2[]= new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		Union(arr1,arr2);
	}
	public static void Union(int[] arr1,int[] arr2) {
		int x=arr1.length+arr2.length+1;
		int[] union=new int[x];
		int count=0,i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				union[count]=arr1[i];
				count++;
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				union[count]=arr2[j];
				count++;
				j++;
			}
			else {
				i++;
				j++;
			}
			for(int k=0;i<x;k++) {
				System.out.print(union[k]);
			}
		}
		
	}
}
