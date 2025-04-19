package practice;
import java.util.Scanner;
public class input {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("enter your name:");
	String name = scan.nextLine();
	System.out.print("enter your age:" );
	int age = scan.nextInt();
	System.out.print("enter the gpa: ");
	double gpa = scan.nextDouble();
	}
}
