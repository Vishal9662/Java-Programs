package directory;

import java.io.File;

public class Traverse_Directory {

	public static void main(String[] args) {
		File file[]=new File("D:\\Vishal").listFiles();
		
		traverseFiles(file);
		
		
	}

	public static void traverseFiles(File[] file) {
		for(File fileName : file) {
			
			if(fileName.isDirectory()) {
				System.out.println("Directory:- "+fileName.getName());
				
				traverseFiles(fileName.listFiles());
			}
			else {
				System.out.println("File name is:- "+fileName.getName());
			}
			
		}		
	}
}
