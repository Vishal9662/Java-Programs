package File_Compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZipFile {

	public static void main(String[] args) {
		
		String source="D:\\tm.txt";
		String target="D:\\tm.gz";
		
		byte[] buffer=new byte[1024];
		
		try {
			GZIPOutputStream gos=new GZIPOutputStream(new FileOutputStream(target));
			FileInputStream fis=new FileInputStream(source);
			
			int size;
			while((size=fis.read(buffer))>0) {
				gos.write(buffer, 0, size);
			}
			
			fis.close();
			gos.finish();
			gos.close();
			
			System.out.println("File is compressed into GZip format...");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
