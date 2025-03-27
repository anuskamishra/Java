package Test;

public class Bike extends Vehicle{
    boolean hasgear;
	public Bike(String vehicleno, String brand, String model , double rentalPriceDay, boolean isAva, boolean hasgear) {
		super(vehicleno, brand, model, rentalPriceDay, isAva);
		this.hasgear=hasgear;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("does it has gear :"+hasgear);
	}
}