package ExceptionHandling;

public class UserLogin {
private int pin = 1234;
public void login(int pin) {
	if(this.pin == pin) {
		System.out.println("user successfully logged in");
	}
	else {
		throw new InvalidPinException("this user pin is invalid");
	}
}
public static void main(String[] args) {
	System.out.println("main start");
	UserLogin user = new UserLogin();
	//try{
		user.login(1234);
	//}
	//catch(InvalidPinException e) {
	//	System.out.println(e.getMessage());
	//}
	System.out.println("main end");
}
}
