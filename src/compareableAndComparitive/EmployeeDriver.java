package compareableAndComparitive;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(2, "mishra", 6000);
		Employee e2 = new Employee(1, "Anuska", 5000);
		compareBasedOnName(e1, e2);
		compareBasedOnId(e1, e2);
		compareBasedOnSal(e1, e2);
	}
	public static void compareBasedOnName(Employee e1, Employee e2) {
		if (e1.compareTo(e2) > 0) {
			System.out.println("e1 is greater");
		} else if (e1.compareTo(e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("e1 and e2 are equal");
		}
	}
	public static void compareBasedOnId(Employee e1, Employee e2) {
		CompareEmployeeById compareId = new CompareEmployeeById();
		
		if (e1.compareTo(e2) > 0) {
			System.out.println("e1 is greater");
		} else if (e1.compareTo(e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("e1 and e2 are equal");
		}
	}
	public static void compareBasedOnSal(Employee e1, Employee e2) {
		compareBasedOnSalary compareId = new compareBasedOnSalary();
		if (e1.compareTo(e2) > 0) {
			System.out.println("e1 is greater");
		} else if (e1.compareTo(e2) < 0) {
			System.out.println("e2 is greater");
		} else {
			System.out.println("e1 and e2 are equal");
		}
	}
}
