package hashmap;
import java.util.*;
public class HashMapImplementation {
Entry[] buckets = new Entry[16];
public int getbucketindex(int key) {
	return Math.abs(Integer.hashCode(key))%buckets.length;
}
public void put(int key, int value) {
	int index = getbucketindex(key);
	Entry newEntry = new Entry(key, value);
	Entry head = buckets[index];
	System.out.println("the entry is added at index: "+ index);
	if(head == null) {
		buckets[index] = newEntry;
	}
	else {
		Entry current = head;
		Entry prev = null;
		while(current != null) {
			if(current.key == key) {
				current.value = value;
				return;
			}
			prev = current;
			current = current.next;
		}
		prev.next = newEntry;
	}
}
public int getvalue(int key) {
	int index = getbucketindex(key);
	Entry current = buckets[index];
	
	while(current != null) {
		if(current.key == key) {
			return current.value;
		}
		current = current.next;
	}
	throw new NoSuchElementException("key "+ key+" not found in hashmap");
}
//display value by key
public void displayValueByKey(int key) {
	try {
		int value = getvalue(key);
		System.out.println("key: "+key+" value: "+value);
	}catch(NoSuchElementException e){
		System.out.println("not found");
		
	}
}
public void remove(int key) {
	int index = getbucketindex(key);
	Entry current = buckets[index];
	Entry prev  = null;
	while(current != null) {
		if(current.key == key) {
			if(prev == null) {
				buckets[index] = current.next;
			}
			else {
				prev.next = current.next;
			}
			System.out.println("key: "+key+"removed successfully");
			return;
		}
		prev = current;
		current = current.next;
	}
	throw new NoSuchElementException("Key " + key + " not found. Cannot remove.");
}
public void display() {
	System.out.println("hashmap content: ");
	for(int i=0; i<buckets.length; i++) {
		Entry current = buckets[i];
		if(current != null) {
			System.out.println("bucket"+i+": ");
			while(current!= null) {
				System.out.print(current.key + "="+ current.value);
				current = current.next;
			}
			System.out.println();
		}
	}
}
public static void main(String[] args) {
	HashMapImplementation map  = new HashMapImplementation();
	map.put(10,1);
	map.put(20,9);
	map.put(30, 4);
	map.put(40, 7);
	map.display();
	System.out.println(map.getvalue(10));
	System.out.println(map.getvalue(3));
	map.displayValueByKey(10);
	map.remove(10);
	map.displayValueByKey(10);
	//map.displayValueByKey(30);
	
}
}
