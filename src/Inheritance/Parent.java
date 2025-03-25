package Inheritance;

public class Parent {
static int a = 20;

int b = 20;

static void print() {
	System.out.println("this is a static class");
}

public void message() {
	System.out.println("this is non static method");
}
static {
	System.out.println("static initializer");
}
{
	System.out.println("non static initializer");
}
Parent(){
	System.out.println("parent constructor");
}
}
