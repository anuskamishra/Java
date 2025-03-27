package Inheritance2;

public class person {
private String name;
private int age;
public person(String name, int age) {
    this.name = name;
    this.age = age;
}
public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
