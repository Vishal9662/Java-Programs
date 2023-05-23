package file_Temporary;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {

	public static void main(String[] args) {
		File directoryPath=new File("D:\\");
		String prefix="Temporary_File";
		String suffix=".txt";
		
		try {
			File tmpfile=File.createTempFile(prefix, suffix, directoryPath);
			
			System.out.println("File is created...");

			System.out.println("The path of file is:- "+tmpfile.getAbsolutePath());
			
			
			tmpfile.deleteOnExit();
			
			System.out.println("This file is deleted...");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
