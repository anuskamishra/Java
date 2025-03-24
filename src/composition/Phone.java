package composition;

public class Phone {
String PhoneName;
Battery BatteryType;
public Phone(String name, String type) {
	this.PhoneName = name;
	this.BatteryType = new Battery(type);
}
public void display() {
	System.out.println(PhoneName + " " + BatteryType.type);
}
}
