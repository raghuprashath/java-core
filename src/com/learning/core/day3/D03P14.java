package com.learning.core.day3;
import java.util.*;
public class D03P14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int l =m+n;
		int k[]=new int[l];
		for(int i=0;i<n;i++)
		{
			k[i]=arr1[i];
		}
		for(int i=0;i<m;i++) {
			k[i+n]=arr2[i];
		}
		Arrays.sort(k);
		System.out.print("Union : "+k[0]+" ");
		for(int i=1;i<l;i++)
		{
			if(k[i]!=k[i-1]) {
				System.out.print(k[i]+" ");
			}
		}
		System.out.print(" Intersection : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}

}
