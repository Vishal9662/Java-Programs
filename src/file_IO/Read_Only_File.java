package file_IO;

import java.io.File;
import java.io.IOException;

public class Read_Only_File {

	public static void main(String[] args) throws IOException {
		
		//write into a file...
//		BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\temp.txt"));
//		
//		String s="Welcome to your File...";
//		writer.write(s);
//		
//		writer.close();
//		System.out.println("File written...");
		
		
//-------> Make File read Only...
		File file = new File("D:\\temp.txt");
		
//		file.setWritable(false);	//Another way of make it
		
		file.setReadOnly();

		
		if(file.canWrite()) {
			System.out.println("File is writable...");
		}else {
			System.out.println("File is read only...");
		}
		
	}
}