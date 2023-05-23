package file_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class File_ToArrayBytes {

	public static void main(String[] args) throws IOException {
		File path=new File("D:\\temp.txt");
		
		byte[] arr=method(path);
		
		System.out.println(Arrays.toString(arr));
	}

	
	public static byte[] method(File path) throws IOException {

			FileInputStream fis=new FileInputStream(path);
			
			byte arr[]=new byte[(int)path.length()];
			
			fis.read();
			
			fis.close();
			
		return arr;
	}
}
