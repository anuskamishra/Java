package composition;

public class Phone {
String PhoneName;
Battery BatteryType;
public Phone(String phname, String type) {
	this.PhoneName = phname;
	this.BatteryType = new Battery(type);
}
public void display() {
	System.out.println(PhoneName + " " + BatteryType.type);
}
}
