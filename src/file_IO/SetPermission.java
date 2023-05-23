package file_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SetPermission {

	public static void main(String[] args) {
		File file=new File("D:\\file.txt");
		
		try {
			file.createNewFile();
			System.out.println("File is created at "+file.getAbsolutePath());
			
			
			String data="Hello Vishal, Welcome to your file...";

//			FileWriter writer=new FileWriter(file);
//			
//			writer.write(data);
//			writer.close();
			
			//we can also use this class instead of FileWriter
			FileOutputStream fout=new FileOutputStream(file);

			byte b[]=data.getBytes();	//first we get string into bytes forms..
			fout.write(b);				//write into file..
			fout.close();
			
			System.out.println("Data inserted into file..");


			//Set permission to the file.....
			file.setReadable(true);		//for read
			
			file.setWritable(true);		//for write
			
			file.setExecutable(true);	//for execute
			
			System.out.println("Permission granted on file...");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}


//ekvar file create vkhte je permission aapi didhi e final thy jse,
//psi permission ma change krvo hoy to file ne delete kri ne psi j thse