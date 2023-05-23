package file_Temporary;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteTempFile {

	public static void main(String[] args) throws IOException {
		
		Path temp_file=Paths.get("D:\\Temporary_File8759442048937824523");
		
		boolean result=Files.deleteIfExists(temp_file);
		
		if(result) {
			System.out.println("Yor file is deleted...");
		}
	}
}
