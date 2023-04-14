package java_jackson;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFile_ToMap {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		
		File file=new File("D:\\Student.json");
		
		@SuppressWarnings("unchecked")
		Map<Object, Object> m=mapper.readValue(file, Map.class);
		
		System.out.println("First Name is: "+m.get("firstName"));
		System.out.println("Last Name is: "+m.get("lastName"));
		System.out.println("Roll No is: "+m.get("RollNo"));
		System.out.println("Address is: "+m.get("Address"));
		System.out.println("Mobile Numbers is: "+m.get("Mobile_Numbers"));
		System.out.println("Fees is: "+m.get("Fees"));
		
	}
}