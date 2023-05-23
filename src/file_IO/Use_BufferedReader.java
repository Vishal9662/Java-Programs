package file_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Use_BufferedReader {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br=new BufferedReader(new FileReader("D:\\file.txt"));
			
			String line;
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}