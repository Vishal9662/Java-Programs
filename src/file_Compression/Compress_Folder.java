package file_Compression;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Compress_Folder {

	static List<String> fileList;
	
	public Compress_Folder() {
		
		fileList=new ArrayList<>();
		
	}
	
	static String src="D:\\V_Path";
	static String target="D:\\V.zip";
	
	public static void main(String[] args) {
		
		try {
			getFileList(new File(src));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	//For getting file list..
	public static void getFileList(File file) {
		if(file.isFile()) {
			try {
				fileList.add(target);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
