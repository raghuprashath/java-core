package com.day9;

import java.util.Scanner;

public class D09P01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int lb=0,ub=n-1;
		QuickSort(arr,lb,ub);
		System.out.println("Sorted Array:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}
	public static void QuickSort(int[] arr,int lb,int ub) {
		if(lb<ub) {
		int mid=partition(arr,lb,ub);
		QuickSort(arr, lb, mid-1);
		QuickSort(arr, mid+1, ub);
		}
	}
	public static int partition(int[] arr,int lb,int ub) {
		int pivot=arr[lb];
		int start=lb,end=ub;
		while(start<end) {
			while(pivot>=arr[start]&&start<arr.length-1) {
				start+=1;
			}
			while(pivot<arr[end]) {
				end-=1;
			}
			if(start<end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[end];
		arr[end]=arr[lb];
		arr[lb]=temp;
		return end;
	}
}
