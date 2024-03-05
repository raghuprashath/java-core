package com.learning.core.day3;

import java.util.Scanner;

public class D03P03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A[]= new int[18];
		for(int i=0;i<18;i++) {
			A[i]=sc.nextInt();
		}
		int sum=0,min=A[0];
		for(int i=0;i<=14;i++) {
			sum+=A[i];
			if(min>A[i]) {
				min=A[i];
			}
		}
		int avg=sum/14;
		A[15]=sum;
		A[16]=avg;
		A[17]=min;
		for(int j=0;j<A.length;j++) {
			System.out.print(A[j]+" ");
		}
	}
}
