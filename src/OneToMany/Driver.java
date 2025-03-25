package OneToMany;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter array size");
	int size = scan.nextInt();
	Bank bank = new Bank(size, "SBI");
	boolean flag = true;
	while(flag){
		System.out.println("enter 1 to add customer \n enter 2 to display"+
	"\nenter 3 to exit");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			scan.nextLine();
			System.out.println("enter customer name");
			String name = scan.nextLine();
			Customer customer = new Customer(name);
			bank.addCustomer(customer);
			break;
		case 2:
			bank.displayCustomers();
			break;
		case 3:
			flag = false;
			break;
		}
	}
}
}
