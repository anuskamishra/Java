package Interface;

public class Bike implements Vehicle{
@Override
public void print() {
	System.out.println(speed);
	System.out.println("hello everyone");
}
@Override
public void start() {
	System.out.println("bike is starting");
}
}
