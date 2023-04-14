package File_IO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Use_BufferedInputStream {

	public static void main(String[] args) throws IOException {

		try {
			BufferedInputStream fis=new BufferedInputStream(new FileInputStream("D:\\temp.txt"));
			DataInputStream dis = new DataInputStream(fis);
 			
			while(dis.available() != 0) {
				System.out.println(dis.readLine());
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



/*
Java BufferedInputStream class is used to read information from stream.
It internally uses buffer mechanism to make the performance fast
*/