package com.learning.core.day8;

import java.util.Scanner;

public class D08P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		QueueLinkedList ql=new QueueLinkedList();
		System.out.println("Enter the Element");
		for(int i=0;i<5;i++) {
			int n=sc.nextInt();
			ql.enQueue(n);
		}
		System.out.print("Elements in queue:");
		ql.display();
		System.out.println();
		ql.deQueue();
		ql.deQueue();
		System.out.print("After removing two elements:");
		ql.display();
	}
}
class Node{
	Node next;
	int data;
	public Node(int data) {
		this.next=null;
		this.data=data;
	}
}
class QueueLinkedList{
	Node front,rear;
	public void enQueue(int data) {
		if(front==null) {
			rear=new Node(data);
			front=rear;
		}
		else {
			Node newnode=new Node(data);
			rear.next=newnode;
			rear=newnode;
		}
	}
	public int deQueue() {
		int res;
		if(front==null) {
			return -1;
		}
		else {
			res=front.data;
			front=front.next;
			return res;
		}
	}
	public void display() {
		Node currentNode=front;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}
	}
}
