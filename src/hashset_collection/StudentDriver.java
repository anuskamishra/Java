package hashset_collection;

import java.util.HashSet;

public class StudentDriver {
public static void main(String[] args) {
	HashSet<Student> set = new HashSet<>();
	Student p1 = new Student("Arka", 101);
    Student p2 = new Student("Arka", 101);
    set.add(p1);
    set.add(p2);
    System.out.println(set);
}
}
