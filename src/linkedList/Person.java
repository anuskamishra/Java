package linkedList;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

	public int compareTo(Person other) {
		return Integer.compare(this.age, other.age);
	}
}
