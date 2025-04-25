package filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
public static void main(String[] args) {
	String path = "C:\Users\HP\Desktop\serialse.txt";
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(fis);
	Employee employee = (Employee)ois.readObject();
	System.out.println(employee);
	}
}
