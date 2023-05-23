package java_jackson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialize_User {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\User.json");
		
		if(!file.exists()) {
			file.createNewFile();
			
			System.out.println("File is created..");
		}
		
		
		User u=new User(1, "HS", 47);
		User u1=new User(2, "KH", 42);
		User u2=new User(3, "DM", 23);
		User u3=new User(4, "Vishal", 21);
		User u4=new User(5, "Jaydip", 19);
		
	
		//Adding all user data into arraylist..
		List<User> userList=new ArrayList<>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		
		System.out.println("\nAll data inserted into Arraylist");
		
		
		//Converting data into json format
		ObjectMapper mapper=new ObjectMapper();
		
		mapper.writeValue(file, userList);
		
		System.out.println("\nAll data is written into User.json file...");
		
		
	}
}
