package file_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class Change_ModifiedDate {

	public static void main(String[] args) {
		
		Path path = Paths.get("D:\\file.txt");
		
		 try {
			BasicFileAttributes attr=Files.readAttributes(path, BasicFileAttributes.class);
			FileTime modifiedTime=attr.lastModifiedTime();
			
			System.out.println("Last modofied time is: "+modifiedTime);
			
			LocalDate date= LocalDate.of(2022, 12, 1);
			
			Instant instant=date.atStartOfDay(ZoneId.systemDefault()).toInstant();
			
			Files.setLastModifiedTime(path, FileTime.from(instant));
			
			FileTime newDate=Files.readAttributes(path, BasicFileAttributes.class).lastModifiedTime();
			
			System.out.println("Updated last modified time is: "+newDate);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
	}
	
}
