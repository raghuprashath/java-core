package com.learning.core.day7;

public class D07P02 {
	public static void main(String[] args) {
		LinkedStack ls=new LinkedStack();
		ls.push(10.0);
		ls.push(20.0);
		ls.push(30.0);
		ls.push(40.0);
		System.out.print("The elements of the stack are:");
		while(!ls.isEmpty()) {
			System.out.print(ls.pop()+" ");
		}
		System.out.println();
		ls.push(10.0);
		ls.push(20.0);
		ls.push(30.0);
		ls.push(40.0);
		ls.pop();
		ls.pop();
		System.out.print("After Poping twice:");
		while(!ls.isEmpty()) {
			System.out.print(ls.pop()+" ");
		}
	}
}
class Node{
	Node next;
	double value;
}
class LinkedStack{
	Node head;
	public LinkedStack() {
		head=null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void push(double data) {
		Node exNode=head;
		head=new Node();
		head.value=data;
		head.next=exNode;
	}
	public double pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			double temp=head.value;
			head=head.next;
			return temp;
		}
	}
}