package StaticAndNonStatic;

public class demo {
static {
	System.out.println("1st multiline static initilizer");
}//called by JVM first before it called the main method
//we can have more than one static initializer
static {
	System.out.println("2nd multiline initializer");
	//it will execute in order in which it is declared
}
public demo(){
	System.out.println("constructor");
}
{
	System.out.println("1st non static initializer");
}

public static void main(String[] args) {

System.out.println("main");
demo d1 = new demo();
demo d2 = new demo();
}
}
