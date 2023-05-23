package file_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Read_UTF_File {
	
	public static void main(String[] args) {
		String fileName="D:\\set_permission.txt";
		
		Path path=Paths.get(fileName);
		
		try {
			BufferedReader reader=Files.newBufferedReader(path);
			String str;
			
			while((str=reader.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}