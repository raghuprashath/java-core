package com.learning.core.day8;

class Queue{
	int rear=-1,front=-1;
	int arr[];
	int size;
	public Queue(int size) {
		this.size=size;
		this.arr=new int[size];
	}
	public boolean isFull(){
		return rear==size-1;
	}
	public boolean isEmpty() {
		return rear==-1&&front==-1;
	}
	public void enQueue(int data) {
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
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("The queue is Empty");
			return -1;
		}
		else if(rear==front) {
			int top=arr[front];
			rear=front=-1;
			return top;
		}
		else {
			int top=arr[front];
			front++;
			return top;
		}
	}
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}