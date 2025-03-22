package OOPS;

public class Employee {
	// id name salary company name
	int id;
	String name;
	double salary;
	String company;

//default constructor
	public Employee() {
		System.out.println("No-arg constructor");
	}

//parameterized constructor
	public Employee(int id) {
		this.id = id;
		System.out.println("1 arg constructor");
	}

	public Employee(int id, String name) {
		this(id);
		this.name = name;
		System.out.println("2 arg constructor");
	}

	public Employee(int id, String name, double salary) {
		this(id, name); // constructor chaining
		this.salary = salary;
		System.out.println("3 arg constructor");
	}

	public Employee(int id, String name, double salary, String company) {
		this(id, name, salary); // constructor chaining
		this.company = company;
		System.out.println("4 arg constructor");
	}
}
