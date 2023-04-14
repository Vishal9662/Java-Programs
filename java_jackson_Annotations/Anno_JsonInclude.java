package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonInclude {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		U55 u=new U55(1, null, 21);
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(json);
	}
}


@JsonInclude(JsonInclude.Include.NON_NULL)
class U55{
	
	 public int id;
	 public String name;
	 public int age;

	 

	public U55(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;

	}
}