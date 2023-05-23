package file_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {

	public static void main(String[] args) throws IOException {
		String file = "D:\\file.txt";
		ByFiles(file);
		ByBufferedReader(file);
		ByLineNumberReader(file);
		
	}
	
	//By Files Class
	public static void ByFiles(String file) {
		Path path = Paths.get(file);

		long lines = 0;

		try {
			lines = Files.lines(path).count();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Lines By Files Class: "+lines);
	}
	
	
	//By BufferedReader Class...
	public static void ByBufferedReader(String file) throws IOException {
		long lines=0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while(br.readLine() != null ) {
				lines++;
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Lines By BufferedReader Class: "+lines);
	}
	
	//By LineNumberReader Class...
	public static void ByLineNumberReader(String file) throws IOException {
		long lines = 0;
		
		try {
			LineNumberReader lnr = new LineNumberReader(new FileReader(file));
			
			while(lnr.readLine() != null) {
				lines=lnr.getLineNumber();
			}
			
			lnr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Lines By LineNumberReader Class: "+lines);
	}
	
}
