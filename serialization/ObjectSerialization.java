package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialization {

	public static void main(String[] args) throws IOException {
		User user=new User(1, "Vishal");
		User u=new User(2, "HS");
		User u1=new User(3, "KH");
		User u2=new User(4, "Jaydip");
		
		try {
			FileOutputStream fos=new FileOutputStream(new File("D:\\Object.txt"));
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			oos.writeObject(u);
			oos.writeObject(u1);
			oos.writeObject(u2);
			
			
			System.out.println("Object is written...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
