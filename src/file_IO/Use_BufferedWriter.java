package file_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Use_BufferedWriter {

	public static void main(String[] args) {
		
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\file.txt"));
			
			bw.write("Welcome from BufferedWriter Class...");
			
			System.out.println("Data Written Successfully...");
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}