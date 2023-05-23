package directory;

import java.io.File;

public class CurrentDirectory {

	public static void main(String[] args) {
		
		String path=System.getProperty("user.dir");
		
		System.out.println("The current working directory is:- "+path);
		
		String file=new File("").getAbsolutePath();
		System.out.println("The current working directory is:- "+file);
		
	}
}
