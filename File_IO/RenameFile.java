package File_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFile {
	public static void main(String[] args) {

		//rename or move file...
		Path source=Paths.get("D:\\NewFile.txt");
		Path target=Paths.get("D:\\file.txt");
		
		try {
			Files.move(source, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File is renamed or moved...");
		
		
		
		//rename or move in same directory...
//		Path source=Paths.get("D:\\file.txt");
//		
//		try {
//			Files.move(source, source.resolveSibling("NewFile.txt"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
