package Task2;

public class Professor extends Person {
	String specialization;

    public Professor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    //override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}
