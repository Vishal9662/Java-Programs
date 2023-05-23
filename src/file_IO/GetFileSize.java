package file_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFileSize {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("D:\\temp.txt");
		
		System.out.println("The size of file is:-> "+Files.size(path));
		
		System.out.println("The path of file is:-> "+path.toAbsolutePath());
		
		System.out.println("The parent folder name is:-> "+path.getParent());
		
		System.out.println("The Root folder is:-> "+path.getRoot());
		
		//---------- exists()
		System.out.println();
			if(Files.exists(path)) {		
	
				if(Files.isRegularFile(path)) {
					System.out.println("File is exists...");
				}
				
				if(Files.isDirectory(path)) {
					System.out.println("File is exists, but that is a directory...");
				}
				
			}else {
				System.out.println("File does not exists..");
			}
			
			//---------- iaFileHidden
			System.out.println();
			if(Files.isHidden(path)) {
				System.out.println("File is Hidden...");
			}else {
				System.out.println("File is not Hidden");
			}
	}
}