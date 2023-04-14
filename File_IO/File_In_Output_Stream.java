package File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class File_In_Output_Stream {

	public static void main(String[] args) throws Exception {
		
		try {
			FileOutputStream file=new FileOutputStream("D:\\file.txt");
			
			String s="  ->  Hello User, Welcome to your file";
			int a=65;
			
			file.write(a);// For int
			
			byte b[]=s.getBytes();
			
			file.write(b);
			
			file.close();
			
			System.out.println("Data written to your file...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis=new FileInputStream(new File("D:\\file.txt"));
		
		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
	}

}