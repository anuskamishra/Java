package Test;

public class Vehicle {
	String vehicleno;
	String brand;
	String model;
	double rentalPriceDay;
	boolean isAva;
	public Vehicle(String vehicleno, String brand, String model , double rentalPriceDay, boolean isAva) {
		super();
		this.vehicleno=vehicleno;
		this.brand=brand;
		this.model=model;
		this.rentalPriceDay=rentalPriceDay;
		this.isAva=isAva;
	}
	public void displayDetails() {
		System.out.print(this.vehicleno+ " \n "+this.brand+" \n "+this.model+" \n "+this.rentalPriceDay+" \n "+this.isAva);
		
	}
}
