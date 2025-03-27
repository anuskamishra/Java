package Task2;

public class Student extends Person {
	int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    //override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}
