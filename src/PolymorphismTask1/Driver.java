package PolymorphismTask1;

public class Driver {
public static void main(String[] args) {
	
	Employee emp1 = new FullTimeEmployee("anu", 50000, 5000);
    Employee emp2 = new PartTimeEmployee("anu", 30000, 20);
    emp1.employeeInfo();
    System.out.println("--------------------");
    emp2.employeeInfo();
    
}
static void details(Employee e) {
	if(e instanceof FullTimeEmployee) {
		e.jobrole();
	}
	else {
		e.jobrole();
		((PartTimeEmployee)e).jobDesignation();
	}
}
}
