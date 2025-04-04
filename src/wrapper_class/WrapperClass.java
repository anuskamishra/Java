package wrapper_class;

public class WrapperClass {
	public static void main(String[] args) {
		int i = 10;
		Integer x = new Integer(i); // boxing
		System.out.println("x: " + x);
		Integer z = Integer.valueOf(i);// boxing method 2

		Integer y = i;// auto boxing
		System.out.println("y: " + y);

		int a = y.intValue();// unboxing

		Boolean flag = true;
		boolean b = flag.booleanValue();// unboxing
		System.out.println("a: " + a + " " + "b: " + b);

		Character ch = 'a';// auto-boxing
		char c = ch; // auto-unboxing

		long h = 10000;
		Long j = new Long(h);//boxing traditional way
		System.out.println("j: " + j);
		Long d = Long.valueOf(h);
         
        String s = "123";
        int q = Integer.parseInt(s);
	}
}
