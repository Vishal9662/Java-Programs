package java_jackson;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrettyPrint {

	public static void main(String[] args) throws JsonProcessingException {
		
		Map<Integer, String> m=new HashMap<>();
		
		m.put(1, "HS");
		m.put(2, "KH");
		m.put(3, "DM");
		m.put(4, "Vishal");
		m.put(5, "Jaydip");
		
		System.out.println("In simple Map format..");
		System.out.println(m);
		
		
		//For display data in pretty format..
		ObjectMapper mapper=new ObjectMapper();
		
		String json= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(m);
		System.out.println("\nIn pretty format..");
		System.out.println(json);
		
	}
}
