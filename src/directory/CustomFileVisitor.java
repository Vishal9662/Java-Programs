package directory;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CustomFileVisitor extends SimpleFileVisitor<Path>{

	final Path source;
	private final Path target;
	
	public CustomFileVisitor(String source, String target) {
		this.source=Paths.get(source);
		this.target=Paths.get(target);
		
	}
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr) throws IOException {
		
		Path newDirectory=target.resolve(source.relativize(dir));
		
		try {
			Files.copy(dir, newDirectory);
		} catch (FileAlreadyExistsException  e) {
			return FileVisitResult.SKIP_SUBTREE;
		}
		
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr){
		Path newFile=target.resolve(source.relativize(file));
		
		try {
			Files.copy(file, newFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return FileVisitResult.CONTINUE;
	}
	
	@Override 
	public FileVisitResult postVisitDirectory(Path path,IOException io) {
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		if(exc instanceof FileSystemLoopException) {
			
		}else {
			
		}
		return FileVisitResult.CONTINUE;
	}
	
	
}
