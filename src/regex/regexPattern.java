package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexPattern {
public static void main(String[] args) {
//	String str = "hello world\ntoday is 22";
//	String regex = ".";
	String s = "adam plucked the apple and gave it to aaron";
	String s1 = "this is a good day, be good cacey 17";
	//String regex = "\\d";
	String regex = "a*";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(s);
	while(matcher.find()) {
		System.out.print(matcher.group());
	}
}
}
