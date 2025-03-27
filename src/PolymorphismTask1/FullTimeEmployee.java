package PolymorphismTask1;

public class FullTimeEmployee extends Employee{
private int bonus;
FullTimeEmployee(String name, double salary, int bonus) {
    super(name, salary); // Calls Employee constructor
    this.bonus = bonus;
}
String jobRole() {
    return "Software Engineer"; 
}
void employeeInfo() {//overriding
    super.employeeInfo();
    System.out.println("Bonus: " + bonus);
    System.out.println("Job Role: " + jobRole());
}
}
