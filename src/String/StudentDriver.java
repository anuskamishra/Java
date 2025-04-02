package String;

public class StudentDriver {
public static void main(String[] args) {
	Student s1 = new Student(1, "anuska","female",89.9);
	Student s2 = new Student(1, "anuska","female",89.9);
	System.out.println(s1.toString());
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode());
}
}
