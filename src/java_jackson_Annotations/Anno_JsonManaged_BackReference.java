package java_jackson_Annotations;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonManaged_BackReference {

	public static void main(String[] args) throws JsonProcessingException {
		Stud3 obj=new Stud3(1, "Vishal");
		
		Subjects sub1=new Subjects(11, "Java", obj);
		Subjects sub2=new Subjects(22, "SpringBoot", obj);
		
		obj.addSubjects(sub1);
		obj.addSubjects(sub2);
		
		String json=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(sub2);
		
		System.out.println(json);
		
		
	}
}

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
class Stud3{
	public int id;
	public String name;
	
	@JsonBackReference
	public List<Subjects> subjects;

	public Stud3(int id, String name) {
		this.id = id;
		this.name = name;
		this.subjects = new ArrayList<Subjects>();
	}
	
	public void addSubjects(Subjects subject) {
		subjects.add(subject);
	}
	
}

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "b_Id")
class Subjects{
	public int b_Id;
	public String b_Name;
	
	public Subjects(int b_Id, String b_Name, Stud3 writer) {
		this.b_Id=b_Id;
		this.b_Name=b_Name;
		this.writer=writer;
	}
	
	@JsonManagedReference
	public Stud3 writer;
	
	
}


//	@JsonManagedReference is used for referring to parent objects 
//	@JsonBackReferences is used for marking child objects.