package StackUsingArray;

public class Stack {
private int maxSize;
private int[] stackArray;
private int top;

public Stack(int size) {
	maxSize = size;
	stackArray = new int[maxSize];
	top = -1;
}
public int pop() {
	if(isEmpty()) {
		System.out.println("stack is empty");
		return -1;
	}
	else {
		return stackArray[top--];
	}
}
public void push(int value) {
	if(isfull()) {
		System.out.println("stack is full");
		//return -1;
	}
	else {
		stackArray[++top]=value;
	}
}
public int peek() {
	if(isEmpty()) {
		System.out.println("stack is empty");
		return -1;
	}
	else {
		return stackArray[top];
	}
}public boolean isEmpty() {
	return (top == maxSize-1);
}
public boolean isfull() {
	return(top == maxSize -1);
}
public void display() {
	if(isEmpty()) {
		System.out.println("stack is empty");
	}
	else {
		System.out.println("stack top to bottom: ");
		for(int i=top; i>=0;  i--) {
			System.out.print(stackArray[i]+ " ");
			
			
		}
		System.out.println();
	}
}

}
