package ObjClass;

public class Employee  {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public boolean equals(Object o) {
		if(o instanceof Employee) {
		Employee e = (Employee)o;
		return this.id == e.id && this.salary == e.salary && this.name.equals(e.name);
	}
		return false;
	}
	//public int hashCode() {
	//	return (int)(this.id + this.salary + this.name.hashCode());
	//}
	public int hashCode() {
		return 1;//worst way of overriding the hashcode
	}
}
