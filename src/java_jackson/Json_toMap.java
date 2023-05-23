package java_jackson;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json_toMap {
	
	public static void main(String[] args) {

		ObjectMapper mapper=new ObjectMapper();

		String json="{\"1\":\"Vishal\",\"2\":\"Jaydip\",\"3\":\"HS\"}";
		
				
		try {
			@SuppressWarnings("unchecked")
			Map<Object, Object> m=mapper.readValue(json, Map.class);
			
			System.out.println(m);
			

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}