package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonSetter {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		
		String json= "{\"U_id\":\"1\", \"U_name\":\"Vishal\", \"U_age\":\"21\"}";	
		System.out.println(json);
		
		
		U2 u=mapper.readerFor(U2.class).readValue(json);
		
		System.out.println("\nId:- "+u.getUserId());
		System.out.println("Name:- "+u.getUserName());
		System.out.println("Age:- "+u.getUserAge());

		
		
	}
}


class U2{
	private int id;
	private String name;
	private int age;
	
	
	@JsonSetter("U_id")	//ahiya j name set kryu hoy e json string ma hovu joie, atle ahiya kaik alag aapsu nd field thi match ny thy to b execute thse, e j aano use che
	public void setUserId(int id) {
		this.id = id;
	}
	
	@JsonSetter("U_name")
	public void setUserName(String name) {
		this.name = name;
	}
	
	@JsonSetter("U_age")
	public void setUserAge(int age) {
		this.age = age;
	}
	
	public int getUserId() {
		return id;
	}
	
	public String getUserName() {
		return name;
	}
	
	public int getUserAge() {
		return age;
	}
}