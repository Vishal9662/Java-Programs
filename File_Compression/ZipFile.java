package File_Compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;


public class ZipFile {

	public static void main(String[] args) throws IOException {
		
		String path="D:\\temp.txt";
		String zipFileName="temp.zip";
		
			
			FileInputStream fis=new FileInputStream(path);
			
			FileOutputStream fos=new FileOutputStream(zipFileName);
			
			DeflaterOutputStream dos=new DeflaterOutputStream(fos);
			
			int data;
			while((data=fis.read())!=-1) {
				dos.write(data);
			}
			
			fis.close();
			dos.close();
			
			System.out.println("File is compressed in zip format..");
		
		
	}
}
