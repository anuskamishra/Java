package Interface;

public interface Vehicle {
int speed = 10 ;
void print();
void start();
static void utility() {
	System.out.println("this is a utility method");
}

public static void main(String[] args) {
	utility();
}
}
