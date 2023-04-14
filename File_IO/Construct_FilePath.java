package File_IO;

import java.io.File;
import java.io.IOException;

public class Construct_FilePath {

	public static void main(String[] args) {
		String filename="file.txt";
		String directory=System.getProperty("user.dir");
		
		String absoluteFilePath="";
		
		absoluteFilePath=directory+File.separator + filename;
		
		System.out.println("Final File Path is :-> "+absoluteFilePath);
		
		File file=new File(absoluteFilePath);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File is created");
				
			}
			else {
				System.out.println("File is already exists");
			}
			
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
}