package java_jackson_Annotations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonFormat {

	public static void main(String[] args) throws ParseException, JsonProcessingException {
		
		SimpleDateFormat sf=new SimpleDateFormat("MM-dd-yyyy");
		Date date=sf.parse("12-14-2002");
		
		Stud obj=new Stud(1, "Vishal", 21, date);
		
		String json=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(json);
	}
}


class Stud{
	private int id;
	private String name;
	private int age;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private Date dob;
	
	public Stud(int id, String name, int age, Date dob) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

	
	@JsonProperty("id")
	public int getId() {
		return id;
	}
	
	@JsonProperty("id")
	public void setId(int id) {
		this.id = id;
	}
	
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
}