package practice;

public class PartTimeEmployee extends Employee{
int workinghour;
public PartTimeEmployee(String name, double salary, int workinghour) {
	super(name,salary);
	this.workinghour = workinghour;
	
}
public void parttimeemployeeinfo() {
	super.employeeInfo();
	System.out.println("working hours: "+ workinghour);
	
}
}
