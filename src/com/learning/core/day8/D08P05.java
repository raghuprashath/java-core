package com.learning.core.day8;

import java.util.Scanner;

public class D08P05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		Queue q=new Queue(n);
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			q.enQueue(sc.nextInt());;
		}
		Queue[] arrQueue=new Queue[2];
		Queue oddQueue=new Queue(5);
		Queue evenQueue=new Queue(5);
		arrQueue[0]=oddQueue;
		arrQueue[1]=evenQueue;
		while(!q.isEmpty()) {
			int data=q.deQueue();
			if(data%2==0) {
				evenQueue.enQueue(data);
			}
			else {
				oddQueue.enQueue(data);
			}
		}
		System.out.print("Odd Queue:");
		oddQueue.display();
		System.out.println();
		System.out.print("Even Queue:");
		evenQueue.display();
	}
}
