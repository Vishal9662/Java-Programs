package File_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

	public static void main(String[] args) {
		String fromFile="D:\\file.txt";
		String toFile="D:\\vishal\\file.txt";
		
		try {
			copyFile(fromFile, toFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("File is copied...");
		
	}
	
	public static void copyFile(String from, String to) throws IOException {
		Path fromFile=Paths.get(from);
		Path toFile=Paths.get(to);
		
		if(Files.notExists(fromFile)) {
			System.out.println("File not exists..."+fromFile);
		}
		
		Path parent=toFile.getParent();
		System.out.println(parent);
		
		if(parent!=null) {
			if(Files.notExists(parent)) {
				Files.createDirectories(parent);
				System.out.println("Directory is created..");
			}
		}
		
		Files.copy(fromFile, toFile);
		
	}
}