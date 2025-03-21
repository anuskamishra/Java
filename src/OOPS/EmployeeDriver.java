package OOPS;

public class EmployeeDriver {
public static void main(String[] args) {
	Employee e1 = new Employee(1,"raj",56000.78,"IEM");
//	e1.name = "raj";
//	e1.company = "IEM";
//	e1.id = 1;
//	e1.salary = 67000.54;
	System.out.println(e1.name + " " + e1.company + " " + e1.id + " " + e1.salary);
}
}
