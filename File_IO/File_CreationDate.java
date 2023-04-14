package File_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class File_CreationDate {

	public static void main(String[] args) {
		String filePath="D:\\file.txt";
		
		try {
			Path file=Paths.get(filePath);
			
//			FileTime creationTime=(FileTime) Files.getAttribute(file, "creationTime");	//Only for get creation time..
			
			BasicFileAttributes attr= Files.readAttributes(file, BasicFileAttributes.class);	//For All times..
			
			
			System.out.println("Creation Time is :-> "+ attr.creationTime());
			System.out.println("Last Access Time is :-> "+attr.lastAccessTime());
			System.out.println("Last Modified Time is :-> "+attr.lastModifiedTime());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
