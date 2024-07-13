package FileHandlingDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FielWriterDemo {

	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\Rahul Khartode\\Desktop\\Practice Java\\NewJava\\src\\FileHandlingDemo\\Saurabh.txt");
		file.createNewFile();
		FileWriter writer =new FileWriter(file);
		writer.write("Hello Saurabh\n");
		writer.append("How are you my friend");
		writer.close();// we can see written data in file after closing writer resource only
		System.out.println("Written Successsfully go to the file and check");
	}

}
