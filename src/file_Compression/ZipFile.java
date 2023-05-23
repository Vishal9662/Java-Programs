package file_Compression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class ZipFile {

	public static void main(String[] args) throws IOException {
		
		String file="D:\\V";
		String zipFileName="tm.zip";
					
				
				try {
					FileInputStream fis = new FileInputStream(file);
					FileOutputStream fos=new FileOutputStream(zipFileName);
					
					DeflaterOutputStream dos=new DeflaterOutputStream(fos);

					byte[] bytes=new byte[1024];
					int data;
					while((data=fis.read(bytes)) >= 0) {	//It will read data until there is all data is left..
							dos.write(bytes, 0, data);	//bytes-the data to be written, || 0-until it write the data, || data-length of data..
					}
						
					fis.close();
					dos.close();
						
					System.out.println("File is compressed in zip format..");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
					
				
	
	}
}


// It generate the zip file in eclipse-workspace folder..