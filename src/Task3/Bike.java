package Task3;

public class Bike extends AbstractVehicle{
	public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " Bike started.");
    }
    
    @Override
    public void stop() {
        System.out.println(name + " Bike stopped.");
    }

    @Override
    public void displayType() {
        System.out.println("Vehicle Type: Bike");
    }
}
