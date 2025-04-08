package circularSinglylinkedlist;

public class CircularSinglyLinkedList {

//    private Node head = null;
//    private Node tail = null;
//
//    // Insert a node at the end of the circular singly linked list
//    public void insert(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//        
//            head = newNode;
//            tail = newNode;
//            newNode.next = head;
//        } else {
//            tail.next = newNode;
//            tail = newNode;
//            tail.next = head;
//        }
//    }
	Node head;
	Node temp;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			temp = node;
			node.next = head;
			count++;
		} else {
			temp.next = node;
			temp = node;
			temp.next = head;
			count++;
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			Node current = head;
			do {
				System.out.print(current.data + " ");
				current = current.next;
			} while (current != head);
			// System.out.println("(head)");
		}
	}

	public void insertAt(int data, int position) {
		if (position < 1) {
			System.out.println("Invalid position");
			return;
		}
		if (position > count) {
			System.out.println("position out of bound");
			return;
		}
		if (position == 1) {
			Node node = new Node(data);
			if (head == null) {
				head = node;
				temp = node;
				temp.next = node;
				count++;
			} else {
				node.next = head;
				head = node;
				temp.next = head;
				count++;
			}
			return;
		}
//    	if(position == count) {
//    		Node node = new Node(data);
//    		temp.next = node;
//    		temp=node;
//    		temp.next = head;
//    		count++;
//    		return;
//    	}
		if (position == count) {
			Node node = new Node(data);
			Node current = head;
			int i = 1;
			while (i < count - 1) {
				current = current.next;
				i++;
			}
			current.next = node;
			node.next = temp;
			count++;
			return;
		}
		Node current = head;
		int index = 1;
		while (current.next != head) {
			if (index == position - 1) {
				Node node = new Node(data);
				node.next = current.next;
				current.next = node;
				count++;
				return;
			}
			index++;
			current = current.next;
		}
	}

	public void update(int data, int position) {
		if (position == 1) {
			head.data = data;
			return;
		}
		if (position == count) {
			temp.data = data;
			return;
		}
		if (position > count || position < 1) {
			System.out.println("Invalid position");
			return;
		}
		Node current = head;
		int index = 1;

		while (current.next != head) {
			if (index == position) {
				current.data = data;
				return;
			}
			index++;
			current = current.next;
		}
	}
	public void delete(int position) {
		if(position<1 || position>count) {
			System.out.println("position out of bound");
			return;
		}
		if(head == null) {
			System.out.println("No data to delete");
			return;
		}
		Node lastNode = head;
		do {
			lastNode = lastNode.next;
		}
		while(lastNode != head);
		
		if(position == 1) {
			Node current = head;
			head = head.next;
			current.next = null;
			temp.next = head;
			count--;
			return;
		}
		if(position == count) {
			Node current = head;
			while(current.next.next!= head) {
				current = current.next;
			}
			current.next = head;
			temp = current;
			count--;
			return;
		}
		Node current = head;
		int i=1;
		do {
			if(i== position-1) {
				Node node = current.next;
				current.next = current.next.next;
				node.next = null;
				count--;
				return;
			}
			current = current.next;
			i++;
		}while(current!=head);
	}
}
