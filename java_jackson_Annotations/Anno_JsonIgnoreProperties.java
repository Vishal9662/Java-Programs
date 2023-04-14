package java_jackson_Annotations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonIgnoreProperties {		//Here we can also use @JsonIgnore and @JsonIgnoreType

	public static void main(String[] args) throws JsonProcessingException {
		U44 u=new U44(1, "Vishal", 21, 21, "Hyy");
		
		ObjectMapper mapper=new  ObjectMapper();
		
		String  json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(u);
		
		System.out.println(json);
	}
}


@JsonIgnoreProperties("age")	//age ni value add krsu to b e ene ignore krse..
class U44{
	
	 public int id;
	 public String name;
	 public int age;
	 public Hyy nmObj;
	 
	 @JsonIgnore 
	 public int ads;
	
	public U44(int id, String name, int age, int ads, String nm){
		this.id=id;
		this.name=name;
		this.age=age;
		this.ads=ads;
		nmObj=new Hyy(nm);
	}
}


//class type field ne ignore krva mate @JsonIgnoreType no use thy..

@JsonIgnoreType
class Hyy{
	public String nm;
	
	public Hyy(String nm) {
		this.nm=nm;
	}
}