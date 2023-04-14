package File_Compression;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class DeCompress_Object {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new File("D:\\tm.gz");
		try {
			FileInputStream fis=new FileInputStream(file);
			
			GZIPInputStream gis=new GZIPInputStream(fis);
			
			ObjectInputStream ois=new ObjectInputStream(gis);
			
			User res=(User) ois.readObject();
			User res1=(User) ois.readObject();
			
			ois.close();
			
			System.out.println("The data of res:- "+res);
			System.out.println("The data of res1:- "+res1);

			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
