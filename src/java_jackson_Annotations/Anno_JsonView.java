package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Anno_JsonView {

	public static void main(String[] args) throws JsonProcessingException {
		Stud2 obj=new Stud2(1, "Vishal", 21);
		
		String json=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(json);
	}
}


class Stud2{
	
	@JsonView(Views.Public.class)
	private int id;
	
	@JsonView(Views.Public.class)
	private String name;
	
	@JsonView(Views.Internal.class)
	private int age;
	
	
	public Stud2(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	class Views{
		
		static class Public{		}
		
		static class Internal extends Public{}
	}
	
}