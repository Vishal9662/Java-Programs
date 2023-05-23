package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class Anno_JsonFilter {

	public static void main(String[] args) throws JsonProcessingException {
		Stud5 obj=new Stud5(1, "Vishal", 21);
		
		FilterProvider filter=new SimpleFilterProvider().addFilter("ageFilter", SimpleBeanPropertyFilter.filterOutAllExcept("age"));
		
		String json=new ObjectMapper().writer(filter).withDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(json);
	}
}


@JsonFilter("ageFilter")
class Stud5{
	public int id;
	public String name;
	public int age;
	
	public Stud5(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
}

//filter jenu nakhsu e 1 j aavse baki na bdha ignore krse..
//this annotation used when we want to apply filter while serialization and de-serialization, means which properties is used or not..