package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonCreator {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		String json= "{\"id\":\"1\", \"name\":\"Vishal\", \"age\":\"21\"}";	
		
		System.out.println(json);
		
		U11 u=mapper.readerFor(U11.class).readValue(json);
		
		System.out.println("Id: "+u.id+", Name: "+u.name+", Age: "+u.age);
		
		
	}
}


class U11{
	
	 public int id;
	 public String name;
	 public int age;
	
	@JsonCreator
	public U11(@JsonProperty("U_Id") int id, @JsonProperty("U_Name") String name, @JsonProperty("U_Age") int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}

	
	
}

/*

However, there is no U_Id field in our target entity, there is only a name field.
Now we don't want to change the entity itself, we just need a little more control over the unmarshalling process
 							by annotating the constructor with @JsonCreator, and using the @JsonProperty annotation as well
 							
This annotation must used with @JsonProperty annotation..
It is used for De-serialization..  
*/