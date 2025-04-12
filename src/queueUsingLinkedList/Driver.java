package queueUsingLinkedList;

public class Driver {
public static void main(String[] args) {
	Queue queue = new Queue();
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	queue.display();
	queue.dequeue();
	queue.display();
	System.out.println(queue.peek());
}
}
