package Inheritance;

public class Driver {
public static void main(String[] args) {
Bike b = new Bike("k","V4");
Car c = new Car("Ferrari",1000,"V8");
b.display();
c.display();
//System.out.println(b.engineType);
System.out.println(c.price);
}
}
