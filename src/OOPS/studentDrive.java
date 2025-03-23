package OOPS;
import java.util.Scanner;


public class studentDrive {
    public static void main(String[] args) {
        // Creating a student object
    	Studentmsnsgement student = new Studentmsnsgement("abc@example.com", "pass123", "abc", 21, "Female", "Computer Science");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. View Student Details");
            System.out.println("2. Update Student Details");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    student.displayStudentInfo();
                    break;
                case 2:
                    System.out.println("Update Fields:");
                    System.out.print("New Name: ");
                    student.setName(scanner.nextLine());
                    
                    System.out.print("New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    student.setAge(newAge);

                    System.out.print("New Gender: ");
                    student.setGender(scanner.nextLine());

                    System.out.print("New Branch: ");
                    student.setBranch(scanner.nextLine());

                    System.out.print("New Password: ");
                    student.setPassword(scanner.nextLine());

                    System.out.println("Details updated successfully!");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
