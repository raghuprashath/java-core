package com.learning.core.day7;

import java.util.Scanner;

public class D07P06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		Stack6 s=new Stack6(n);
		System.out.println("Enter the Values");
		for(int i=0;i<n;i++) {
			s.push(sc.nextInt());
		}
		s.getMin();
	}
}
class Stack6 {
	int n;
	int arr[];
	int top;
	public Stack6(int n) {
		this.n=n;
		this.arr=new int[n];
		this.top=-1;
	}
	public boolean isFull() {
		return top==n-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		else {
			top+=1;
			arr[top]=data;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			int value=arr[top];
			top--;
			return value;
		}
	}
	public void getMin() {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				}	
			}
		System.out.println(min);
	}
}
