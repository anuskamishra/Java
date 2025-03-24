package Aggregation;

public class BankDriver {
public static void main(String[] args) {
	Customer customer = new Customer("Anuska");
	Bank bank = new Bank("SBI", customer);
	bank.display();
	bank = null;
	System.out.println(customer.name);
}
}
