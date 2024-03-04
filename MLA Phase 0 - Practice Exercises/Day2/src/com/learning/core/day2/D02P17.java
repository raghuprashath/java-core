package com.learning.core.day2;

import java.util.Scanner;

public class D02P17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count+=1;
					break;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
				if(i<n) {
					System.out.print(",");
				}
			}
		}
	}

}
