package practice;

public class Employee {
String name;
Double salary;
public Employee(String name, Double salary) {
	this.name = name;
	this.salary = salary;
}
public void employeeInfo() {
	 System.out.println("Name: " + name);
     System.out.println("Salary: " + salary);
}
}
