package ObjClass;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public String toString() {
		return id+" "+salary+" "+ name;
	}
}
