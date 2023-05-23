package file_IO;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class File_StringToInputStream {

	public static void main(String[] args) throws IOException {
		
		String str="Hello User";
		
		InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
		
		try {
			FileOutputStream fos = new FileOutputStream(new File("D:\\file.txt"));
			
			int read;
			byte[] bytes = new byte[8192];
			while((read = is.read(bytes)) != -1) {
				fos.write(bytes, 0 , read);
			}
			
			System.out.println("String to InputStream is converted...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
