package list;

import java.util.*;

public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList();
		employees.add(new Employee(1, "anuska"));
		employees.add(new Employee(2, "muskan"));
		employees.add(new Employee(3, "naveen"));

		System.out.println(employees);

		for (Employee e : employees) {
			System.out.println(e);
		}

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		for (int i : al) {
			System.out.println(i);
		}
		// concurrentModificationException is created for manipulating the iterating
		// arraylist
		// break is used to avoid is after manipulating the arraylist
//		for(int i : al) {
//			if(i==30) {
//				Integer x = i;
//				al.remove(x);
//				break;
//			}
//		}
//		Iterator<Employee> emp = employees.iterator();
//		while (emp.hasNext()) {
//			Employee x = emp.next();
//			if (x.name.equals("naveen")) {
//				emp.remove();
//			}
//			System.out.println(employees);
//			System.out.println("-----------------------------------------------------");
//
//			ListIterator list = al.listIterator();
//			while (list.hasNext()) {
//				System.out.println("Index: " + list.nextIndex() + "    " + "Element:  " + list.next());
//			}
//			System.out.println("-----------------------------------------------------");
//		}
ArrayList  c = new ArrayList();
c.add(10);
c.add(2);
c.add(4);
c.add(1);

Collections.sort(c);
System.out.println(c);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int x = itr.next();
			if (x == 30) {
				itr.remove();
			}
		}
		System.out.println(al);
	}
}
