package file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class File_ByteArrToFile {

	public static void main(String[] args) throws IOException {
		
		String str="All Gujarati peoples are wise and kind people...";
		
		byte[] bytes = str.getBytes();
		
		String path="D:\\set_permission.txt";
		File file = new File(path);
		
		try {
			OutputStream os = new FileOutputStream(file);
		
			os.write(bytes);
			
			os.close();
			
			System.out.println("Successfully byte data inserted into file...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
