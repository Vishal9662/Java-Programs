package File_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Read_Only_File {

	public static void main(String[] args) throws IOException {
		
//		BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\temp.txt"));
//		
//		String s="Welcome to your File...";
//		writer.write(s);
//		
//		writer.close();
//		System.out.println("File written...");
		
		File file = new File("D:\\temp.txt");
		
//		file.setWritable(false);	//Another way of make it read only
		
		file.setReadOnly();

		
		if(file.canWrite()) {
			System.out.println("File is writable...");
		}else {
			System.out.println("File is read only...");
		}
		
	}
}
