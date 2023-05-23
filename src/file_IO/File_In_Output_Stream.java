package file_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_In_Output_Stream {

	public static void main(String[] args) throws IOException {
		
		try {
			//For write into a file
			FileOutputStream file=new FileOutputStream("D:\\file.txt");
			
			String s="  ->  Hello User, Welcome to your file";
			int a=65;
			
			file.write(a);// For int, It ta
						
			file.write(s.getBytes());
			
			file.close();
			
			System.out.println("Data written to your file...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Use of FileInputStream-> Read data from file
		FileInputStream fin=new FileInputStream(new File("D:\\file.txt"));
		
		int line;
		while((line=fin.read()) != -1) {
			System.out.print((char)line);
		}
		
		
		
	}

}