package file_Compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class UnZipFile {

	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\VishalGohil\\eclipse-workspace\\Java\\tm.zip";
		String target ="D:\\tm-Unzipped.txt";
		
		FileInputStream fis=new FileInputStream(source);
		
		FileOutputStream fos=new FileOutputStream(target);
		
		InflaterInputStream iis=new InflaterInputStream(fis);
		
		byte[] bytes=new byte[1024];
		int data;
		while((data=iis.read(bytes)) >= 0) {
			fos.write(data);
		}
		
		fos.close();
		iis.close();
		
		System.out.println("File is UnZipped");
		
		
	}
}