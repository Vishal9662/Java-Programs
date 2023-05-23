package java_jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class De_serialization {

	public static void main(String[] args) throws IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		
		String st="{\r\n"
				+ "    \"age\":21,\r\n"
				+ "    \"name\":\"Vishal\"\r\n"
				+ "}";
		
		try {
		
			Student student=mapper.readValue(st, Student.class);	//read json data from student class and student json file that is called De-serialization
			System.out.println(student);
					
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
	}
}