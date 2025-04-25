package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {
public static boolean isvalidpassword(String password) {
	String regex  = "^(?=.*[0-9]) (?=*[a-z])(?=.[A-Z])(?=*[@#$%^&+=!])(?=\\S+$).(8,20}$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(password);
	return matcher.matches();
}
public static void main(String[] args) {
	String password1 = "Strong@123";
	String password2 = "weakpass";
	System.out.println("password 1 valid? "+ isvalidpassword(password1) );
	System.out.println("password 2 valid?" + isvalidpassword(password2));
}
}

