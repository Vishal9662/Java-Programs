package file_IO;

import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		String directoryPath="D:\\";
		String extension=".pdf";
		
		File directory=new File(directoryPath);
		
		File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));
		
		if(files == null) {
			System.out.println("No file are available with given extension..");
		}
		else {
			
			for(File file:files) {
				if(file.delete()) {
					System.out.println("File is deleted :- "+file.getName());
				}
				else {
					System.out.println("Failed to delete :- "+file.getName());
				}
			}
		}
		
	}
			
}