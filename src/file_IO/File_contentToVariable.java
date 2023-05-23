package file_IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_contentToVariable {

	public static void main(String[] args) throws IOException {
		try {
			DataInputStream dis=new DataInputStream(new FileInputStream("D:\\file.txt"));
			System.out.println(dis.available());//size of text which is inserted in file..
			
			byte[] dataBytes=new byte[dis.available()];
			dis.readFully(dataBytes);
			
			dis.close();
			
			String content=new String(dataBytes, 0, dataBytes.length);
			System.out.println(content);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}