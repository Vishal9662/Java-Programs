package directory;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Copy_directory {

	public static void main(String[] args) throws IOException {

		
		String sourcePath="D:\\Vishal";
		String targetPath="D:\\Copy_Vishal";
		
		
		CustomFileVisitor fileVisitor=new CustomFileVisitor(sourcePath, targetPath);
		
		Files.walkFileTree(Paths.get(sourcePath), fileVisitor);
		
		
		
		System.out.println("directory is copied..");
		
		
	}
}
