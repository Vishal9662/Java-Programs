package File_IO;

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
		String fileName="D:\\file.txt";
		
		List<String> lines=Arrays.asList("Line1", "Line2","Line3");
		
		Path path=Paths.get(fileName);
		try {
			BufferedWriter writer=Files.newBufferedWriter(path, StandardCharsets.UTF_8);
			
			for(String line:lines) {
				writer.append(line);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
