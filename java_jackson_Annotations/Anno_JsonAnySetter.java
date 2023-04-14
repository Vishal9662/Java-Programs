package java_jackson_Annotations;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonAnySetter {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		String json= "{\"id\":\"1\", \"name\":\"Vishal\", \"age\":\"21\"}";	

		U33 u=mapper.readerFor(U33.class).readValue(json);
		
		System.out.println("Id:-> "+u.getMap().get("id"));
		System.out.println("Name:-> "+u.getMap().get("name"));
		System.out.println("Age:-> "+u.getMap().get("age"));

		
	}
}

class U33{
	
	private Map<Object, Object> map;
	
	public U33() {
		map=new HashMap<>();
	}

	public Map<Object, Object> getMap() {
		return map;
	}


	@JsonAnySetter
	public void add(Object key, Object value) {
		map.put(key, value);
	}
	
	
}