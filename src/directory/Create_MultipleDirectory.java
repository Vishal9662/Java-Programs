package directory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create_MultipleDirectory {

	public static void main(String[] args) throws IOException {
		
		File path=new File("D:\\Dir\\Multiple\\Vishal");
		
		boolean bool=path.mkdirs();
		if(bool) {
			System.out.println("Your multiple directory is created By File Class...");
		}
		
		
		//Another way of create multiple directories...
		Path pth=Paths.get("D://Dirs//Multiple//Vishal");
		
		Files.createDirectories(pth);
		
		System.out.println("Your multiple directory is created By Files Class...");

	}
}
