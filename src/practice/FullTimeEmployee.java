package practice;

public class FullTimeEmployee extends Employee {
int bonus;
public FullTimeEmployee(String name, double salary, int bonus) {
	super(name, salary);
	this.bonus = bonus;
}
public void fullTimeEmployee() {
	super.employeeInfo();
	System.out.println("Bonus: "+ bonus);
}
}
