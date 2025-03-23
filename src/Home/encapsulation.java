package Home;

import java.util.Scanner;

class encapsulation {
    // Private fields (Encapsulation)
    private String name;
    private int age;
    private double salary;

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        } else {
            System.out.println("Invalid age. Setting default value (18).");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) { // Validation
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Setting default value (10000).");
            this.salary = 10000;
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        // Taking user input
        System.out.print("Enter Employee Name: ");
        emp.setName(scanner.nextLine());

        System.out.print("Enter Employee Age: ");
        emp.setAge(scanner.nextInt());

        System.out.print("Enter Employee Salary: ");
        emp.setSalary(scanner.nextDouble());

        // Displaying employee details
        emp.displayEmployeeInfo();

        scanner.close();
    }
}

