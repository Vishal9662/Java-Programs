package java_jackson_Annotations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonAnyGetter {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		Scanner sc=new Scanner(System.in);
		
		U1 u=new U1();
		
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		u.add("id", id);
		
		System.out.println("Enter Name: ");
		String name=sc.next();
		u.add("name", name);
	
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		u.add("age", age);
		
		
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(json);
		
		
		sc.close();
	}
}

class U1{

	Map<Object, Object> userData; 
	
	public U1() {
		userData=new HashMap<>();
	}

	@JsonAnyGetter
	public Map<Object, Object> getUserData() {
		return userData;
	}
	
	public void add(Object key, Object value) {
		userData.put(key, value);
	}
	
	
}


//The @AnyGetter annotation allows the getter method for returning a Map which we then used for serializing..