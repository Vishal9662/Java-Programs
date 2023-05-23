package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonUnwrapped {

	public static void main(String[] args) throws JsonProcessingException {
		
		Stud1.Name name=new Stud1.Name();
		name.first="Vishal";
		name.last="Gohil";
		
		Stud1 obj=new Stud1(1, name, 21);
		
		String json=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(json);
	}
}


class Stud1{
	private int id;
	
	@JsonUnwrapped
	private Name name;
	private int age;
	
	
	public Stud1(int id, Name name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	static class Name{
		public String  first;
		public String  last;
	}
	
}