package java_jackson_Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JacksonAnnotationsInside {
	
	public static void main(String[] args) throws JsonProcessingException {

		Stud6 obj=new Stud6(1, "Vishal", 21);
		
		String json=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(json);
	}

	
}



//@JacksonAnnotationsInside used for create custom json Annotation..

@CustomAnnotation
class Stud6{
	public int id;
	public String name;
	public int age;
	
	Stud6(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
}


@Retention(RetentionPolicy.RUNTIME)	//aa custom annotation runtime effect thavu joie..
@JacksonAnnotationsInside
@JsonInclude(value = Include.NON_NULL)
@JsonPropertyOrder({"name", "id", "age",})
@interface CustomAnnotation{
}