package Task3;

public class Driver {
	public static void main(String[] args) {
		Vehicle car = new Car("Tesla", 50);
		Vehicle bike = new Bike("Yamaha", 30);
		Vehicle truck = new Truck("Volvo", 70);

		// Using polymorphism (Upcasting)
		Vehicle[] vehicles = { car, bike, truck };

		for (Vehicle v : vehicles) {
			v.start();
			v.accelerate(20);
			v.brake(10);
			System.out.println("Current Speed: " + v.getCurrentSpeed() + " km/h");
			v.displayType();
			v.stop();
			System.out.println("-----------------------------");
		}
	}
}//task done something something
