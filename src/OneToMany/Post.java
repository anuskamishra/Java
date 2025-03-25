package OneToMany;

public class Post {
    User[] u;   // Changed 'user' to 'User' (Java convention)
    String postname;
    int count = 0;  // Removed static to make it instance-specific

    public Post(int size, String postname) {
        this.u = new User[size];
        this.postname = postname;
    }

    public void addCustomer(User user) {
        if (count < u.length) {  // Fixed 'user.length' to 'u.length'
            u[count++] = user;
            System.out.println("User added");
        } else {
            System.out.println("Cannot add user, the array is full");
        }
    }

    public void displayCustomers() {  // Moved method outside addCustomer()
        if (count == 0) {
            System.out.println("No users to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(u[i].username);  // Fixed 'user[i]' to 'u[i]'
        }
    }
}
