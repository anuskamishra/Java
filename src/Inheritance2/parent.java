package Inheritance2;

public class parent {
	String name;
	int age;

	public parent(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public parent(String name) {
		this.name = name;
	}

	public parent() {
		System.out.println("parent constructor");
	}
}
