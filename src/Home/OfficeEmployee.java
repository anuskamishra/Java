package Home;

import java.util.Scanner;

class OfficeEmployee {
    // Private fields (Encapsulation)
    private String employeeId;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public OfficeEmployee() {
    }

    // Getter and Setter methods with validation
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {  // Validation
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Setting default salary (30000).");
            this.salary = 30000;
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

