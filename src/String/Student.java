package String;

import java.util.Objects;

public class Student {
// student name id gender and marks (double type)
	//override equal tostring and hash code
	private int id;
	private String name;
	private String gender;
	private double marks;
	public Student(int id, String name, String gender, double marks) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(gender, id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(gender, other.gender) && id == other.id
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}
	
	
}
