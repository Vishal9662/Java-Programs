package directory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create_directory {

	public static void main(String[] args) {
		
		File path=new File("D:\\V");
		
		boolean bool=path.mkdir();
		
		if(bool) {
			System.out.println("Directory is created...");
		}else {
			System.out.println("Something went wrong...");
		}
		
		
		//Another way of create directory...
		
		Path pth=Paths.get("D:\\V_Path\\Vish");
		
		try {
			Files.createDirectories(pth);	//Here we also able to create multiple directories..
			
			System.out.println("Your directory is created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
