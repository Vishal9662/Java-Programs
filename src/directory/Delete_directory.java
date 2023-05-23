package directory;

import java.io.File;

public class Delete_directory {

	public static void main(String[] args) {
		
		File file=new File("D:\\V_Path");
				
			//If you want to delete directory which don't have sub folders then follow this manner
			file.delete();
			
			System.out.println("Your Directory is deleted which don't have sub folders...");
		
			
		if(file.exists()){
		
			deleteDirectories(file);
			
			System.out.println("Your Directory is deleted which have sub folders...");
	
			file.delete();
		}
		
	}
	
	public static void deleteDirectories(File file) {
		//If you want to delete directory which have sub folders then follow this manner
				for(File subfile:file.listFiles()) {
					
					if(subfile.isDirectory()) {
						deleteDirectories(subfile); //Here it recursive the function..
					}
					
					subfile.delete();
				}
	}
}
