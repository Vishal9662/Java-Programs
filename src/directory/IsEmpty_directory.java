package directory;

import java.io.File;

public class IsEmpty_directory {

	public static void main(String[] args) {
		
		File file=new File("D:\\V");
		
		if(file.isDirectory()) {
			
			if(file.list().length >0) {
				System.out.println("Directory is not empty...");
			}
			else {
				System.out.println("Directory is empty...");
			}
		}
		else {
			System.out.println("This is not directory...");
		}
	}
}
