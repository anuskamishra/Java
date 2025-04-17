package hashset_collection;

import java.util.*;

class Person{
	String name;
	int id;
	
	Person(String name, int id){
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
}
public class HashSetDemo {
public static void main(String[] args) {
	HashSet<Person> set = new HashSet<>();
	Person p1 = new Person("Arka", 101);
    Person p2 = new Person("Arka", 101);
    set.add(p1);
    set.add(p2);
    System.out.println(set);
}
}
