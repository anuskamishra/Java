package Task2;

public class Drive {
	public static void main(String[] args) {
        University university = new University();

        Student student = new Student("Alice", 20, 101);
        Professor professor = new Professor("Dr. Smith", 45, "Computer Science");

        university.addPerson(student);
        university.addPerson(professor);

        university.showPeople();
    }
}
