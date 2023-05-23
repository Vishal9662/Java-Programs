package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonTypeInfo {

	public static void main(String[] args) throws JsonProcessingException {
		
		String name="Vishal";
		int age=21;
		
		Helper obj=new Anno_JsonTypeInfo.Another1(name, age);
		
		String result=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(result);
		
		String json="{ \"name\":\"SubType_className\", \"id\":\"1\", \"type\":\"second\"}";
		
		System.out.println(json);
		
		Another an=new ObjectMapper().readerFor(Helper.class).readValue(json);
		System.out.println(an.name);
	}



	@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "type")
		@JsonSubTypes({
			@JsonSubTypes.Type(value = Another.class, name = "second"),
			@JsonSubTypes.Type(value = Another1.class, name = "third")
		})
	static class Helper{
		public String name;
		
		Helper(String name){
			this.name=name;
		}
	}

	
	@JsonTypeName("second")
	static class Another extends Helper{
		public int id;
		
		
		public Another(String name, int id) {
			super(name);
			
			this.id=id;
		}
		
		public Another() {
			this(null, 0);
		}
	}
	
	
	@JsonTypeName("third")
	static class Another1 extends Helper{

		public int age;
		
		Another1(String Username, int age) {
			super(Username);
			this.age=age;
			
		}
		
		public Another1() {
			this(null, 0);
		}
		
	}

}

/*

*/