package practice;

public class Student extends Person {
private int id;
public Student(String name, int age, int id) {
	super(name, age);
	this.id = id;
}
public void displayStudentdetail() {
	super.displaystudentdetail();
	System.out.println("Student ID: "+ id);
}
public static void main(String[] args) {
	Student s = new Student("Anuska", 21, 2003);
	s.displayStudentdetail();
}
}



