package java_jackson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModel {

	public static void main(String[] args) throws JsonProcessingException {
		Person person=new Person();

		ObjectMapper mapper=new ObjectMapper();
		
		System.out.println("Hello Person, Please");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		person.setAge(age);

		System.out.println("Enter Name: ");
		String name=sc.next();
		person.setName(name);
		
		System.out.println("How many childs you have: ");
		int n=sc.nextInt();
		
		List<String> list=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter childName: ");
			
			list.add(sc.next());
		}
		
		person.setChild(list);
		
		String jsonString=mapper.writeValueAsString(person); //store all person data into json format
		System.out.println(jsonString);
		
		
		//Adding json String into Tree Model...
		JsonNode rootNode=mapper.readTree(jsonString);	//here we stored all json data into Node of Tree..
										//for traversing data, we must have to Get each node using relative path to the root node while traversing tree and process the data. 
		
		JsonNode ageNode=rootNode.path("age"); //store age data into node of tree..
		System.out.println("Person Age is: "+ageNode.asInt());
		
		JsonNode nameNode=rootNode.path("name"); //store name data into node of tree..
		System.out.println("Person Name is: "+nameNode.textValue());
		
		
		JsonNode childNames=rootNode.path("child");
		Iterator<JsonNode> itr=childNames.elements();
		
		System.out.print("Child Names are: ");
		while(itr.hasNext()) {
			JsonNode data=itr.next();
			System.out.print(data.textValue()+", ");
		}
		
		System.out.print("\n\nOperation is Ended..");
		sc.close();
	}
}


class Person{
	
	private int age;
	private String name;
	private List<String> childName;
	
	
	public Person() {
		
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getChild() {
		return childName;
	}
	public void setChild(List<String> list) {
		this.childName = list;
	}


	
}