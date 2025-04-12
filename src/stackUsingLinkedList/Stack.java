package stackUsingLinkedList;

public class Stack {
private Node top;

public Stack() {
	this.top = null;
}
public void push(int value) {
	Node newNode = new Node(value);
	newNode.next = top;
	top = newNode;
}
public int pop() {
	if(isEmpty()) {
		System.out.println("stack is empty");
		return -1;
	}
	int poppedval = top.data;
	top = top.next;
	return poppedval;
	
}
public int peek() {
	if(isEmpty()) {
		System.out.println("stack is empty");
		return -1;
		
	}
	return top.data;
}
public boolean isEmpty() {
	return top == null;
}
public void display() {
	if(isEmpty()) {
		System.out.println("stack is empty");
		return;
	}
	System.out.println(" stack top to bottom: ");
	Node temp = top;
	while(temp != null) {
		System.out.print(temp.data+ " ");
		temp = temp.next;
	}
	System.out.println();
}
}
