package file_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class File_InputStreamToString {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("D:file.txt");
			
			Scanner sc=new Scanner(is);
			
			StringBuffer sb=new StringBuffer();
			while(sc.hasNext()) {
				sb.append(sc.nextLine());
			}

			System.out.println(sb.toString());
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
