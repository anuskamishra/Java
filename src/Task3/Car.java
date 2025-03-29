package Task3;

public class Car extends AbstractVehicle {
	public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " Car started.");
    }

    @Override
    public void stop() {
        System.out.println(name + " Car stopped.");
    }
    
    @Override
    public void displayType() {
        System.out.println("Vehicle Type: Car");
    }
}
