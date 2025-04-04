package compareableAndComparitive;

public class Employee implements Comparable {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}
//compare based on salary

//public int compareTo(Object o) {
//	Employee e = (Employee)o;
//	return (int)(this.salary-e.salary);
//}
//comparing based on string
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.name.compareTo(e.name);
	}
}
