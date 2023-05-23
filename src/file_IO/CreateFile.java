package file_IO;

import java.io.File;
import java.io.IOException;


public class CreateFile {
	public static void main(String[] args) {
		
		//By using File.createNewFile() Method...
			File file=new File("D:\\file2.pdf");
			
			boolean result;
			
			try {
				result=file.createNewFile();	//create a new file...
				if(result) {
					System.out.println("File is created at location:-> "+file.getAbsolutePath());
				}
				else {
					System.out.println("File is already exists at location:-> "+file.getAbsolutePath());
				}
				
				System.out.println("File Name: "+file.getName());
				System.out.println("Writable: "+file.canWrite());
				System.out.println("Readable: "+file.canRead());
				System.out.println("Size: "+file.length());
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
				
	}
}