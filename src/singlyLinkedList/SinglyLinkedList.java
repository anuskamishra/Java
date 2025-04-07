package singlyLinkedList;

public class SinglyLinkedList {
	Node head;
	Node tail;
    static int count;
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null){ // for first node
			head = node;
			tail = node;
			count++;
		}//insertion
		else {
			tail.next = node; //for rest of the node
			tail=node;
			count++;
		}
	}
	public void display() {
		if(head == null) {
			System.out.println("no data to diplay");
			return;
		}
		else {
			Node current = head;
			while(current != null){
				System.err.println(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	public void update(int data, int position) {
		if(position == 1) {
			head.data = data;
			return;
		}
		if(position == count) {
			tail.data = data;
			return;
		}
		if(head == null) {
			System.out.println("no data to update");
			return;
		}
		if(position<1 || position > count) {
			System.err.println("position out of bound");
			return;
		}
		Node current = head;
		for(int i=1; i<count; i++) {
			if(i==position) {
				current.data = data;
				return;
			}
			current = current.next;
		}
	}
	public void insertAt(int data, int position) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			count++;
			return;
		}
		
		if(position==1) {
			node.next = head;
			head = node;
			count++;
			return;
		}
		
		
		
		Node current = head;
		for(int i=1; i<=count; i++) {
			if(i == position-1) {
				node.next =  current.next;
				current.next = node;
				count++;
				return;
			}
			current = current.next;
		}
	}
	public void deleteAt(int position) {
		if(head == null) {
			System.out.println("No element to delete");
			return;
		}
		if(position == 1) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			count--;
			return;
		}
		Node current = head;
		if(position == count) {
			for(int i =1; i<=count; i++) {
				if(i == position-1) {
					current.next = null;
					count--;
					return;
				}
				current = current.next;
			}
		}
		for(int i=0; i<=count; i++) {
			if(i==position-1) {
				Node temp = current;
				current = current.next;
				temp.next = current.next;
				current.next = null;
				count--;
			}
			current = current.next;
		}
			
		
	}
}
