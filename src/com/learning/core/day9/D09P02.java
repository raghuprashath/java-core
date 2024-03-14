package com.day9;

import java.util.Scanner;

public class D09P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int start=0,end=n-1;
		mergeSort(arr,start,end);
		System.out.println("Sorted Array:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}
	public static void mergeSort(int[] arr,int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr,start,mid,end);
		}
	}
	public static void merge(int[] arr,int start,int mid,int end) {
		int i=start;
		int j=mid+1;
		int k=start;
		int ar[]=new int[arr.length];
		while(i<=mid&&j<=end) {
			if(arr[i]<arr[j]) {
				ar[k]=arr[i];
				i++;
				k++;
			}
			else {
				ar[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
				ar[k]=arr[i];
				i++;
				k++;
		}
		while(j<=end) {
				ar[k]=arr[j];
				j++;
				k++;
		}
		for(i=start;i<=end;i++) {
			arr[i]=ar[i];
		}
	}
}
