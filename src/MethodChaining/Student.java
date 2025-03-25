package MethodChaining;

public class Student {
String name;
int id;
public Student setName(String name) {
	this.name = name;
	return this;//address of currently addressing object
	
}
public void display() {
	System.out.println(this.name+"  "+this.id);
	
}
}
