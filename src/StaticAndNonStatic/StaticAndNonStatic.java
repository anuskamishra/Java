package StaticAndNonStatic;

public class StaticAndNonStatic {
	
	//non static block context
class demo1 {
	int id = 1;
	static String name = "Raj";
	public demo1() {
		System.out.println(id);
		System.out.println(name);
	}
	
	
}
//static context
public static void main(String[] args) {
	demo1 d = new demo1();
	System.out.println(d.name);
	class demo2{
	
	}
}
}
