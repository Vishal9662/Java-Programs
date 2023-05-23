package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JacksonInject {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		String json= "{ \"name\":\"Vishal\", \"age\":\"21\" }";	
		
		InjectableValues values=new InjectableValues.Std().addValue(int.class, 11);	//Here we inject values to the field..
		
		U22 u=mapper.reader(values).forType(U22.class).readValue(json);
		
		System.out.println("Id: "+u.id+", Name: "+u.name+", Age: "+u.age);

		
	}
}

class U22{
	
	@JacksonInject
	public int id;
	public String name;
	public int age;
	
}