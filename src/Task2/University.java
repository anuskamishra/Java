package Task2;
import java.util.ArrayList;
public class University {
	ArrayList<Person> people;

    public University() {
        this.people = new ArrayList<>();
    }

    void addPerson(Person p) {
        people.add(p);
    }

    void showPeople() {
        for (Person p : people) {
            p.displayInfo();
            System.out.println("----------------------");
        }
    }
}
