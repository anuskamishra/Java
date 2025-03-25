package OneToMany;

public class Bank {
Customer[] customers;
String bankName;
static int count = 0;

public Bank(int size, String bankName){
	this.customers = new Customer[size];
	this.bankName = bankName;
}
public void addCustomer(Customer customer) {
	if(count < customers.length) {
		customers[count++] = customer;
		System.out.println("customer added");
	}
	else {
		System.out.println("cannot add customer, the array is fill");
	}
}
public void displayCustomers() {
	for(int i=0; i<count; i++) {
		System.out.println(customers[i].customerName);
	}
}
}
