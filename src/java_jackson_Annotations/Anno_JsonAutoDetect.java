package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonAutoDetect {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		U66 u=new U66(1, "Vishal", 21);
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(json);
	}
}


//@JsonAutoDetect can be used to include properties which are not accessible otherwise..

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class U66{
	
	 public int id;
	 public String name;
	 public int age;

	
	public U66(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;

	}
	
}
