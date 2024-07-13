package FileHandlingDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Rahul Khartode\\Desktop\\Practice Java\\NewJava\\src\\FileHandlingDemo\\Saurabh.txt");
		Scanner sc= new Scanner(file);
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
		System.out.println("Read Successsfully");
		

	}

}
