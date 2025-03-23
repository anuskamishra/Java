package Home;

import java.util.Scanner;

public class encapsulationdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        encapsulation emp = new encapsulation();

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

