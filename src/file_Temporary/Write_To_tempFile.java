package file_Temporary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_To_tempFile {

	public static void main(String[] args) {
		
		try {
			File dirPath=new File("D:\\");
			File tmpFile=File.createTempFile("Write_Temp", ".txt", dirPath);
			
			BufferedWriter bw=new BufferedWriter(new FileWriter(tmpFile));
			
			bw.write("Hello User, Welcome to your temporary file.");
			bw.write("I'm from BufferedWriter Class...");
			
			bw.close();
			
			System.out.println("Data written into your temp file...");
			System.out.println("Yor file location is: "+tmpFile.getAbsolutePath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
