package queueUsingLinkedList;

public class Queue {


private Node front;
//private front;
private Node rear;

public Queue() {
	this.front = this.rear = null;
}
public boolean isempty() {
	return front == null;
}
public void enqueue(int data) {
	Node newNode = new Node(data);
	
	if(rear == null) {
		front = rear = newNode;
	}
	else {
		rear.next = newNode;
		rear = newNode;
	}
	//sysout
	
}
public int dequeue() {
	if(isempty()) {
		System.out.println("queue is empty");
		return -1;
	}
	int result = front.data;
	front = front.next;
	
	if(front == null) {
		rear = null;
	}
	return result;
}
public int peek() {
	if(isempty()) {
		System.out.println("queue is empty");
		return -1;
	}
	return front.data;
}
public void display() {
	if(isempty()) {
		System.out.println("queue is empty");
		return;
	}
	Node temp = front;
	System.out.println("queue: ");
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp = temp.next;
	}
	System.out.println();
}
}
