package AccessModifiers;

public class child extends parent {
	void validate() {
		System.out.println(parent.a);
		parent.print();
	}
}
