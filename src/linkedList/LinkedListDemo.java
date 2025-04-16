package linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList list = new LinkedList<>();
	list.add("JAVA");
	list.add("JAVA");
	
	list.add(null);
	list.add(null);
	
	 list.add(42); // Integer
     list.add(3.14); // Double
     list.add(true); // Boolean
     list.add('A'); // Character
     System.out.println(list);
     
     
     System.out.println("-----------------------------");
     
     LinkedList<Person> people = new LinkedList<>();
     people.add(new Person("anuska", 21));
     people.add(new Person("Muskan", 23));
     people.add(new Person("ag", 18));
     System.out.println("before sorting");
     for(Person p : people) {
    	 System.out.println(p);
     }
     Collections.sort(people);
     System.out.println("after sorting");
     for(Person p: people) {
    	 System.out.println(p);
     }
     
     Iterator<Person> descItr = people.descendingIterator();
     while(descItr.hasNext()) {
    	 System.out.println(descItr.next());
     }
     System.out.println("------------------------------------");
     System.out.println(people.peek());
     System.out.println(people.pop());
     System.out.println(people.peekLast());
     System.out.println(people.pollLast());
     
    //people.push("hello", 25);
     
}
}
