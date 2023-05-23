package file_IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Write_UTF_File {

	public static void main(String[] args) {
		String fileName="D:\\set_permission.txt";
		
		List<String> lines=Arrays.asList("િે્્ી54ે્ેવનવન");
		
		 Path path = Paths.get(fileName);
	        try {
	        	
	           Files.write(path, lines, StandardCharsets.UTF_8);	//Here we can use any class for write into file..
	           
	           //Another way of write into file..
//	           BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
//	           bw.write("Hello...");
	           
//	           bw.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		System.out.println("Success...");
	}
}
