package com.learning.core.day7;

public class D07P01 {
	public static void main(String[] args) {
		Stack s=new Stack(4);
		s.push(40);
		s.push(40);
		s.push(40);
		s.push(40);
		s.push(40);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}
}
class Stack {
	int n;
	int arr[];
	int top;
	public Stack(int n) {
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
			System.out.println("After Pushing 4 Elements:Hello world java Programming");
		}
		else {
			top+=1;
			arr[top]=data;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("After a Pop:SHello world java");
			return -1;
		}
		else {
			int value=arr[top];
			top--;
			return value;
		}
	}
}
