package File_Compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class UnZipFile {

	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\Vishal Gohil\\eclipse-workspace\\Hops\\temp.zip";
		String target ="D:\\tm.txt";
		
		FileInputStream fis=new FileInputStream(source);
		
		FileOutputStream fos=new FileOutputStream(target);
		
		InflaterInputStream iis=new InflaterInputStream(fis);
		
		int data;
		while((data=iis.read())!=-1) {
			fos.write(data);
		}
		
		fos.close();
		iis.close();
		
		System.out.println("File is UnZipped");
		
		
	}
}
