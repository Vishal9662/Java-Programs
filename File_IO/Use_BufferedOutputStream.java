package File_IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//It makes performance fast than other classes.
public class Use_BufferedOutputStream {
	public static void main(String[] args) throws Exception {
		
		try {
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\file.txt"));
			
			String s="Welcome from BufferedOutputStream Class";
			byte b[]=s.getBytes();
			bos.write(b);
			
			System.out.println("Data Added succesfully...");
			bos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
