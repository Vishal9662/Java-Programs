package java_jackson_Annotations;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Anno_JsonIdentityInfo {

	public static void main(String[] args) throws JsonProcessingException {
		Stud4 obj=new Stud4(1, "Vishal");
		
		Subjectss sub1=new Subjectss(11, "Java", obj);
		Subjectss sub2=new Subjectss(22, "SpringBoot", obj);
		
		obj.addSubjects(sub1);
		obj.addSubjects(sub2);
		
		String json=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(sub2);
		
		System.out.println(json);
		
		
	}
}

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
class Stud4{
	public int id;
	public String name;
	
	public List<Subjectss> subjects;

	public Stud4(int id, String name) {
		this.id = id;
		this.name = name;
		this.subjects = new ArrayList<Subjectss>();
	}
	
	public void addSubjects(Subjectss subject) {
		subjects.add(subject);
	}
	
}


@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "b_Id")
@JsonIdentityReference(alwaysAsId = false)
class Subjectss{
	public int b_Id;
	public String b_Name;
	
	public Subjectss(int b_Id, String b_Name, Stud4 writer) {
		this.b_Id=b_Id;
		this.b_Name=b_Name;
		this.writer=writer;
	}

	public Stud4 writer;
	
}
	
//ahiya jo aapde @JsonIdentityReference ema true use krsu to only id j print krse.. nd false krsu to bdha data as it is print krse..

//	@JsonIdentityInfo annotation is used when objects have parent child relationship.
//	@JsonIdentityInfo is used to indicate that object identity will be used during serialization/de-serialization.