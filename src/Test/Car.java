package Test;

public class Car extends Vehicle{
	int nodoors;
	public Car(String vehicleno, String brand, String model , double rentalPriceDay, boolean isAva, int nodoors) {
		super(vehicleno, brand, model, rentalPriceDay, isAva);
		this.nodoors=nodoors;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("no of doors="+nodoors);
	}

}
