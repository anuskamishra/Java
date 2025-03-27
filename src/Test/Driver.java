package Test;

public class Driver {
	public static void main(String[] args) {
		Car c=new Car("3","tt","zen",23.6,true,4);
		Bike bk=new Bike("3","tt","zen",23.6,true,true);
		c.displayDetails();
		bk.displayDetails();
		}

}
