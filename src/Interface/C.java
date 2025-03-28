package Interface;


public interface C extends A,B{
default void check() {
	System.out.println(A.a);
	A.message();
	B.message();
	public  static void main(String[] args) {
		super.check();
	}
}
}
