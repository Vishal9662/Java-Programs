package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonPropertyOrder {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		U3 u=new U3(1, "Vishal", 21);
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(json);
	}
}


//with this annotation we can give specific type of order for display data..
@JsonPropertyOrder({"name","age","id"})
class U3{
	
	private int id;
	private String name;
	private int age;
	
	public U3(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}