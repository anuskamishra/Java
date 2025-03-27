package PolymorphismTask1;

public class PartTimeEmployee extends Employee {
	private int workingHours;
	PartTimeEmployee(String name, double salary, int workingHours) {
        super(name, salary); // Calls Employee constructor
        this.workingHours = workingHours;
    }
	String jobDesignation() {
	    return "Associate Software Engineer"; 
	}
	void employeeInfo() {
        super.employeeInfo();
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Job designation: " + jobDesignation());
    }
	public void jobrole() {
		System.out.println("the job role of part time employee is cloud engineer");
	}
}
