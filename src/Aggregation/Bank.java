package Aggregation;

public class Bank {
String Bankname;
Customer customer;
public Bank(String Bankname, Customer customer) {
	this.Bankname = Bankname;
	this.customer = customer;
}
public void display() {
	System.out.println(this.Bankname+" "+this.customer.name);
}
}
