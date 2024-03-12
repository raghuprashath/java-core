package com.learning.core.day7;

import java.util.Scanner;

public class D07P05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		Stack5 s=new Stack5(n);
		System.out.println("Enter the Values");
		for(int i=0;i<n;i++) {
			s.push(sc.nextInt());
		}
		s.reverse(n);
	}
}
class Stack5{
	int n;
	int arr[];
	int top;
	public Stack5(int n) {
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
	public void reverse(int n) {
		if(n==0) {
			return;
		}
		else {
			System.out.print(arr[n-1]+" ");
			reverse(n-1);
		}
	}
}
