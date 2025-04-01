package ObjClass;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, 50000.0, "anu");
		Employee e2 = new Employee(101, 50000.0, "anu");
		//System.out.println(e);
		//System.out.println(e.toString());
		//System.out.println(e==e1);
		//System.out.println(e.equals(e1));
		//System.out.println(e1.equals("hello"));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());//integer value used to represent an object
		String s = "Anuska";
		System.out.println(s.hashCode());
		Employee e = new Employee(101, 50000.0, "anu");
		//Object e3 = e.clone();
				
	}
}
