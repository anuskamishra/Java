package Task3;

abstract class AbstractVehicle implements Vehicle {
	protected String name;
    protected int speed;

    // Parameterized Constructor
    public AbstractVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public void displayDetails() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Current Speed: " + speed + " km/h");
    }

    // Implement common methods
    @Override
    public void accelerate(int increment) {
        speed += increment;
        System.out.println(name + " accelerated by " + increment + " km/h. New speed: " + speed);
    }
    
    @Override
    public void brake(int decrement) {
        speed = Math.max(0, speed - decrement);
        System.out.println(name + " applied brake by " + decrement + " km/h. New speed: " + speed);
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }
}
