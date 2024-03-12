package com.learning.core.day7;

import java.util.*;

public class D07P03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to Reverse");
		String string=sc.nextLine();
		Stack1 s=new Stack1(string.length());
		for(int i=0;i<string.length();i++) {
			s.push(string.charAt(i));
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}
}
class Stack1 {
	int n;
	char arr[];
	int top;
	public Stack1(int n) {
		this.n=n;
		this.arr=new char[n];
		this.top=-1;
	}
	public boolean isFull() {
		return top==n-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void push(char data) {
			top+=1;
			arr[top]=data;
		
	}
	public char pop() {
			char value=arr[top];
			top--;
			return value;
		}
}
