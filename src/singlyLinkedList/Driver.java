package singlyLinkedList;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag = true;
		while (flag) {
		System.out.println("Enter 1 to insert data\nEnter 2 to diplay\n enter 3 to exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter the data");
				int data = scan.nextInt();
				list.insert(data);
				break;
			}
			case 4:
				flag = false;
				break;
			case 2:
				list.display();
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("invaild choice");
			}
		}
	}
}
