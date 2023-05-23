package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Anno_JsonRootName {

	public static void main(String[] args) throws JsonProcessingException {
		U6 u=new U6(1, "Vishal", 21);
		
		ObjectMapper mapper=new  ObjectMapper();
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(json);
	}
}


@JsonRootName("Details")	//root name change krva mate..
class U6{
	private int id;
	private String name;
	private int age;
	
	public U6(int id, String name, int age) {
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}