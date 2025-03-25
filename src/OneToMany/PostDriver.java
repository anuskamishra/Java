package OneToMany;

import java.util.Scanner;

public class PostDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number of users for the post:");
        int size = scan.nextInt();
        scan.nextLine();  // Consume newline left after nextInt()

        System.out.println("Enter post name:");
        String postName = scan.nextLine();

        Post post = new Post(size, postName);
        boolean flag = true;

        while (flag) {
            System.out.println("\n1. Add User \n2. Display Users \n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    if (post.count < size) {
                        System.out.print("Enter username: ");
                        String username = scan.nextLine();
                        User user = new User(username);
                        post.addCustomer(user);
                    } else {
                        System.out.println("Cannot add more users. The list is full.");
                    }
                    break;
                case 2:
                    post.displayCustomers();
                    break;
                case 3:
                    flag = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
        scan.close();  // Close scanner
    }
}
