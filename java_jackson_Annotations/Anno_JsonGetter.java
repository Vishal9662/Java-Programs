package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonGetter {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		User u=new User(1, "Vishal", 21);
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(json);
	}
}


class User{
	private int id;
	private String name;
	private int age;
	
	public User(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public int getId() {
		return id;
	}

	@JsonGetter("name")		//If here I will not use annotation then it will change atrribute due to changing getMethod name.. 
	public String getUserName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}

//@JsonGetter annotations used for mark method as getter method..