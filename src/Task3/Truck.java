package Task3;

public class Truck extends AbstractVehicle {
	public Truck(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " Truck started.");
    }

    @Override
    public void stop() {
        System.out.println(name + " Truck stopped.");
    }
    
    @Override
    public void displayType() {
        System.out.println("Vehicle Type: Truck");
    }
}
