package com.learning.core.day8;

import java.util.Scanner;

public class D08P01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		Queue q=new Queue(n);
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			q.enQueue(sc.nextInt());;
		}
		System.out.print("Elements in Queue:");
		q.display();
		System.out.println();
		q.deQueue();
		System.out.print("After removing First element:");
		q.display();
	}
}
