package File_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SetPermission {

	public static void main(String[] args) {
		File file=new File("D:\\set_permission.txt");
		
		try {
			file.createNewFile();
			System.out.println("File is created at "+file.getAbsolutePath());
			
			
			String data="Hello Vishal, Welcome to your file...";

			FileWriter writer=new FileWriter(file);
			
			writer.write(data);
			writer.close();
			
//			FileOutputStream fout=new FileOutputStream(file);
//
//			byte b[]=data.getBytes();
//			fout.write(b);
//			fout.close();
			
			System.out.println("Data inserted into file..");


			//Set permission to the file.....
			file.setReadable(true);		//read
			
			file.setWritable(true);		//write
			
			file.setExecutable(true);	//execute
			
			System.out.println("Permission granted on file...");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}


//ekvar file create vkhte je permission aapi didhi e final thy jse,
//psi permission ma change krvo hoy to file ne delete kri ne psi j thse