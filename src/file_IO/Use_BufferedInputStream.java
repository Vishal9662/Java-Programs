package file_IO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Use_BufferedInputStream {

	public static void main(String[] args) throws IOException {
		
		InputStream f=new FileInputStream("D:\\file.txt");

		try {
			BufferedInputStream fis=new BufferedInputStream(f);
			DataInputStream dis=new DataInputStream(fis);
			
			while(dis.available() != 0) {
				System.out.println(dis.readLine());
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}



/*
Java BufferedInputStream class is used to read information from stream.
It internally uses buffer mechanism to make the performance fast
Buffer means short memory used for store small size of data.
*/