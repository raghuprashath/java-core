package com.learning.core.day8;

class CircularQueue{
	int rear=-1,front=-1;
	int arr[];
	int size;
	public CircularQueue(int size) {
		this.size=size;
		this.arr=new int[size];
	}
	public boolean isFull(){
		return front==(rear+1)%size;
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
			rear=front=-1;
			return -1;
		}
		else {
			int top=arr[front];
			front=(front+1)%size;
			return top;
		}
	}
	public void display() {
		for(int i=front;i!=rear;i=(i+1)%size) {
			System.out.print(arr[i]+" ");
		}
	}
}