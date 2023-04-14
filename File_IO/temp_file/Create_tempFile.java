package File_IO.temp_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Create_tempFile {

	public static void main(String[] args) {
		
		String tmpdir = System.getProperty("java.io.tmpdir");
		System.out.println("Temp file path is:- "+tmpdir);
		
		try {
			Path temp = Files.createTempFile("Hii User, ", ".file");
			System.out.println("Temp file is:- "+temp);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}