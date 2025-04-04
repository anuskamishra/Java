package compareableAndComparitive;

import java.util.Comparator;

public class compareBasedOnSalary implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o1;
		return e1.id - e2.id;
	}
}
