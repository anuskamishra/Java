package doublyLinkedList;

import java.util.*;

public class Drive {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"enter 1 for add\n enter 2 for display forward\n enter 3 to display backward\n enter 4 to update\n enter 5 to insert at a position"
							+ "\n enter 6 to delete" + "");
			int choice = scan.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter data");
				list.insert(scan.nextInt());
				break;
			}
			case 2:
				list.displayForward();
				break;
			case 3:
				list.displayBackward();
				break;
			case 4:
				System.out.print("Enter position to update: ");
				int position = scan.nextInt();
				System.out.print("Enter new data: ");
				int newData = scan.nextInt();
				list.update(position, newData);
				break;
			case 5:
				System.out.println("enter the position to insert: ");
				int Position = scan.nextInt();
				System.out.println("enter the data: ");
				int data = scan.nextInt();
				list.insertAt(Position, data);
				break;
			case 6:
				System.out.println("enter the position to delete: ");
				int A = scan.nextInt();
				list.delete(A);
				break;

			}
		}

	}
}
