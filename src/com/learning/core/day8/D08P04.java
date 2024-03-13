package com.learning.core.day8;

import java.util.Scanner;

public class D08P04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		Queue1 q=new Queue1(n);
		for(int i=0;i<n;i++) {
			q.enQueue(sc.next());;
		}
		if(q.isEmpty()) {
			System.out.println("Empty");
		}
		else {
			System.out.println("Not Empty");
		}
	}
}
class Queue1{
	int rear=-1,front=-1;
	String arr[];
	int size;
	public Queue1(int size) {
		this.size=size;
		this.arr=new String[size];
	}
	public boolean isFull(){
		return rear==size-1;
	}
	public boolean isEmpty() {
		return rear==-1&&front==-1;
	}
	public void enQueue(String data) {
		if(isFull()) {
			System.out.println("The queue is full");
		}
		else if(rear==-1) {
			rear=front=0;
			arr[rear]=data;
		}
		else {
			rear+=1;
			arr[rear]=data;
		}
	} 
}