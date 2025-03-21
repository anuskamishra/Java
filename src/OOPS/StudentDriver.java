package OOPS;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "raj";
		s1.college = "IEM";
		s1.ID = 1;
		s1.marks = 67.54;

		System.out.println(s1.college + " " + s1.ID + " " + s1.marks + " " + s1.name);
		s1.study();
		System.out.println("-----------------------------------------------------------");
		Student s2 = new Student();
		s2.name = "ravi";
		s2.college = "IEM";
		s2.ID = 2;
		s2.marks = 68.54;
		System.out.println(s1.college + " " + s2.ID + " " + s2.marks + " " + s2.name);
		s2.study();
	}
}
