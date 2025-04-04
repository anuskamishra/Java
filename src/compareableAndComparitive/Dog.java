package compareableAndComparitive;

import java.util.Arrays;
import java.util.Comparator;

public class Dog {
    String name;
    int age;
    String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    

    @Override
    public String toString() {
        return breed + " " + name + " " + age;
    }

    public static void main(String[] args) {
     
        Dog[] dogs = {
            new Dog("Husky", 5, "Siberian"),
            new Dog("Pug", 7, "Toy"),
            new Dog("Golden", 3, "Retriever"),
            new Dog("Pug", 4, "Bulldog"),
            new Dog("Husky", 2, "Alaskan"),
            new Dog("Golden", 6, "Retriever")
        };

        Comparator<Dog> dogComparator = Comparator
            .comparing((Dog d) -> d.breed)  
            .thenComparing(d -> d.name)     
            .thenComparingInt(d -> d.age);  

        Arrays.sort(dogs, dogComparator);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
