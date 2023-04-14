package File_Compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class UnGZipFile {
	public static void main(String[] args) {
		
		String source="D:\\tm.gz";
		String target="D:\\tmt.txt";
		
		byte[] buffer=new byte[1024];
		
		try {
			GZIPInputStream gis=new GZIPInputStream(new FileInputStream(source));
			FileOutputStream fos=new FileOutputStream(target);
			
			int size;
			while((size=gis.read(buffer)) >0) {
				fos.write(buffer, 0, size);
			}
			
			fos.close();
			gis.close();
			
			System.out.println("File is uncompressed to unGZip format...");
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
