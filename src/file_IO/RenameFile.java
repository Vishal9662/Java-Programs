package file_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFile {
	public static void main(String[] args) {
		
//----------->  rename or move in same directory...
//		Path source=Paths.get("D:\\NewFile.txt");
//		
//		try {
//			Files.move(source, source.resolveSibling("file.txt"));
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("File is renamed or moved in same directory...");
		
		
//----------->  rename or move file into another directory...
		Path source=Paths.get("D:\\file.txt");
		Path target=Paths.get("D:\\Vishal\\file.txt");
		
		try {
			Files.move(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File is renamed or moved...");
		
	}

}