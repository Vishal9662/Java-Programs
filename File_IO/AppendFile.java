package File_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class AppendFile {
	public static void main(String[] args) throws IOException {
		String path="D:\\file.txt";
		
		String add="  This is Appended text...";
		
		appendUsingPrintWriter(path, add);
		
		appendUsingFileOutputStream(path, add);
		
	}
	
	public static void appendUsingPrintWriter(String path, String add) {
		File file=new File(path);
		try {
			FileWriter fr=new FileWriter(file,true);
			BufferedWriter br=new BufferedWriter(fr);
			PrintWriter pr=new PrintWriter(br);
			pr.println(add+"By PrintWriter Class..");
			
			pr.close();
			br.close();
			fr.close();
			
			System.out.println("Data appended...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void appendUsingFileOutputStream(String path, String add) throws IOException {
		
		try {
			OutputStream os=new FileOutputStream(new File(path));
			
			os.write(add.getBytes());
			
			os.close();
			
			System.out.println("Data Appended By OutputStream Class...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
