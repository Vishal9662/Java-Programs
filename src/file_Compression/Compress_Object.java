package file_Compression;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

public class Compress_Object {

	public static void main(String[] args) throws IOException {
		User u=new User(1, "HS");
		User u1=new User(2, "KH");
		User u2=new User(3, "Vishal");
		User u3=new User(4, "Jaydip");
		
		File file =new File("D:\\Compressed_Object.txt");
		
		try {
			FileOutputStream fos=new FileOutputStream(file);
			
			GZIPOutputStream gos=new GZIPOutputStream(fos);
			
			ObjectOutputStream oos=new ObjectOutputStream(gos);
			
			oos.writeObject(u);
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(u3);
			
		
			oos.flush();
			fos.close();

			System.out.println("All Object is compressed...");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}