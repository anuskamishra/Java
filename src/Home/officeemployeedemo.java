package Home;

import java.util.Scanner;

public class officeemployeedemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficeEmployee employee = new OfficeEmployee();

        // Taking user input
        System.out.print("Enter Employee ID: ");
        employee.setEmployeeId(scanner.nextLine());

        System.out.print("Enter Employee Name: ");
        employee.setName(scanner.nextLine());

        System.out.print("Enter Employee Department: ");
        employee.setDepartment(scanner.nextLine());

        System.out.print("Enter Employee Salary: ");
        employee.setSalary(scanner.nextDouble());

        // Display employee details
        employee.displayEmployeeDetails();

        scanner.close();
    }
}


