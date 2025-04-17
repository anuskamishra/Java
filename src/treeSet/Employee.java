package treeSet;

import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
String name;
double salary;
public Employee(String name, double salary) {
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return name +"  "+ salary;
}
@Override
public int compareTo(Employee other) {
    return Double.compare(this.salary, other.salary);
}


public static void main(String[] args) {
	//TreeSet<Employee> employees = new TreeSet<>();
	 // TreeSet with custom comparator for name descending
    TreeSet<Employee> employees = new TreeSet<>(
        (e1, e2) -> {
            int cmp = e2.name.compareTo(e1.name); // Descending by name
            if (cmp == 0) {
                return Double.compare(e2.salary, e1.salary); // fallback if names are same
            }
            return cmp;
        }
    );
    employees.add(new Employee("Anuska", 234.56));
    employees.add(new Employee("Ravi", 190.75));
    employees.add(new Employee("Sneha", 305.00));
    employees.add(new Employee("Kiran", 220.00));
    for(Employee e : employees) {
    	System.out.println(e);
    }
    System.out.println("-------------------------------------");
    for (Employee e : employees.descendingSet()) {
        System.out.println(e);
    }
}

}
