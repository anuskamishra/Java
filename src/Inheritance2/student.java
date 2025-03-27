package Inheritance2;

public class student extends person{
private int studentid;
public student(String name, int age, int studentid) {
	super(name, age);
	this.studentid = studentid;

}
public void displayStudentDetails() {
    super.displayPersonDetails();
    System.out.println("Student ID: " + studentid);
    
}
}
