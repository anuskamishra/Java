package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class csvWrite {
public static void main(String[] args) throws Exception {
	String path = "C:\\Users\\HP\\Desktop\\new";
	File file = new File(path);
	file.createNewFile();
	try(FileWriter writer = new FileWriter(file)){
		writer.append("id, name, age\n");
		writer.append("1,Rohit, 25\n");
		writer.append("1,Rohit, 25\n");
		writer.append("1,Rohit, 25\n");
		
		System.out.println("csv file written successfully");
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
