package File_IO;

import java.io.File;
import java.io.FilenameFilter;

public class DeleteFile {
	 static String FILE_DIR="D:\\";

	 static String FILE_EXT=".pptx";
	
	public void deleteFile(String folder, String extension) {
		FileExtFilter filter = new FileExtFilter(extension);
		
		File direction = new File(folder);
		
		String[] list=direction.list(filter);
		
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		
		if(list.length == 0) {
			return;
		}
		
		File fileDelete;
		
		for(String file : list) {
			String temp = new StringBuffer(FILE_DIR)
							.append(File.separator)
							.append(file)
							.toString();
			
			fileDelete  =new File(temp);
			
			boolean isdeleted = fileDelete.delete();
			
			System.out.println("File: "+temp+" is deleted : "+isdeleted);
		}
		
	}

	public static void main(String[] args) {
		new DeleteFile().deleteFile(FILE_DIR, FILE_EXT);
	}
}


class FileExtFilter implements FilenameFilter{

	String extension;
	public FileExtFilter(String extension) {
		this.extension=extension;
		
	}
	
	@Override
	public boolean accept(File dir, String name) {

		return (name.endsWith(extension));
	}
	
}