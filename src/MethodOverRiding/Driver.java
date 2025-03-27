package MethodOverRiding;

public class Driver {
	public static void main(String[] args) {
		Animal dogAnimal = new Dog("Siberian Husky");//upcasting
		dogAnimal.sound();
		String dogBreed = ((Dog)dogAnimal).breed;
		System.out.println(dogBreed);
		dogAnimal.sound();
		Animal d = new Dog();//upcasting
		d.sound();
		Tiger t = new Tiger();
		t.sound();
	}
}
