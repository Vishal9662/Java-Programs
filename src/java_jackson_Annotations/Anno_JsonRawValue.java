package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonRawValue {

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper=new  ObjectMapper();
		
		U4 u=new U4(1, "vishal", "{\"2\":\"Vishal\", \"3\":\"Jaydip\", \"1\":\"HS\"}"); 
		
		String Stjson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(Stjson);
	}
}



class U4{
	
	private int id;
	private String name;
	@JsonRawValue	//with this annotation we can display json type data in json format or else it will give same string which we given..
	private String json;
	
	public U4(int id, String name, String json) {
		this.id=id;
		this.name=name;
		this.json=json;
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

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
	
	
}