package queueUsingArray;

public class Queue {
private int[] queue;
private int front;
private int rear;
private int capacity;
private int size;
public Queue(int capacity) {
	this.capacity = capacity;
	this.queue = new int[capacity];
	this.front = 0;
	this.rear = -1;
	this.size = 0;
}
public boolean isfull() {
	return size == capacity;
}
public boolean isEmpty() {
	return size == 0;
}
public void enqueue(int element) {
	if(isfull()) {
		System.out.println("queue is full");
		return;
	}
	rear++;
	queue[rear] = element;
	size++;
}
public int dequeue() {
	if(isEmpty()) {
		System.out.println("Queue is empty");
		return -1;
	}
	int removed = queue[front];
	front++;
	size--;
	//System.out.println("deque");
	return removed;
}
public int peek() {
	if(isEmpty()) {
		System.out.println("queue is empty");
		return -1;
	}
	return queue[front];
}
public void display() {
	if(isEmpty()) {
		System.out.println("queue is empty");
		
		
	}
	for(int i= front; i<= rear; i++) {
		System.out.println(queue[i]+" ");
	}
	System.out.println();
}
}
