package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonValue {

	public static void main(String[] args) throws JsonProcessingException {
	
		ObjectMapper mapper=new ObjectMapper();
		
		U5 u=new U5(1, "Vishal", 21);
		
		String json=mapper.writeValueAsString(u);
		
		System.out.println(json);
		
		System.out.println("\nIn pretty format..");
		String js=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(js);
		
	}
}


class U5{
	private int id;
	private String name;
	private int age;
	
	public U5(int id, String name, int age) {

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

	
	@JsonValue	//when we apply this annotation then it will print data in json format only..
	@Override
	public String toString() {
		return "User {id=" + id + ", name=" + name + ", age=" + age + "}";
	}
	
	
	
}