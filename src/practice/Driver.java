package practice;

public class Driver {
public static void  main(String[] args) {
	 FullTimeEmployee ft = new FullTimeEmployee("Alice", 70000, 5000);
     PartTimeEmployee pt = new PartTimeEmployee("Bob", 30000, 20);
     
     System.out.println("full time employee info:");
     ft.fullTimeEmployee();
     System.out.println("---------------------------------------------------");
     System.out.println("part time employee info:");
     pt.parttimeemployeeinfo();
}
}
