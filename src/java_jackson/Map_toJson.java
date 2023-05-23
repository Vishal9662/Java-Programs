package java_jackson;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Map_toJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Map<Object, Object> m=new HashMap<>();
		m.put(1, "Vishal");
		m.put(2, "Jaydip");
		m.put(3, "HS");
		
		System.out.println("In defaut Map..");
		System.out.println(m);
		
		JSONObject obj=new JSONObject();
		obj.putAll(m);
		System.out.println("\nIn Json format..");
		System.out.println(obj);
		
//		 without pretty format..
		System.out.println("\nWithout Pretty format..");
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("D:\\Streaming.json"), m);
		Map msd=mapper.readValue(new File("D:\\Streaming.json"), Map.class);
		System.out.println(msd);
		
		//with pretty format..
		System.out.println("\nDisplay in pretty format..");
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(m);
		System.out.println(json);
	
	}
}

//Jackson is a java based library it is used for serialize or map or convert java objects into JSON...