package com.learning.core.day7;

public class D07P07 {
	public static void main(String[] args) {
		Stack7 s=new Stack7(4);
		s.push(15);
		s.push(25);
		s.push(30);
		s.push(40);
		System.out.println(s.peek()%2==0);
	}
}
class Stack7 {
	int n;
	int arr[];
	int top;
	public Stack7(int n) {
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
	public int peek() {
		return arr[top];
	}
}
