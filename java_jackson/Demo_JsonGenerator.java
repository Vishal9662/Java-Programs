package java_jackson;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo_JsonGenerator {

	public static void main(String[] args) {
		
		JsonFactory factory=new JsonFactory();	//creating instance of JsonFactory for create generator
		
		try {
			JsonGenerator generator=factory.createGenerator(new File("D:\\Binding.json"), JsonEncoding.UTF8);
													//using createGenerator(), we have to create the instance of JsonGenerator..
			
			
			Scanner sc=new Scanner(System.in);
			generator.writeStartObject();
			
			System.out.println("Enter Name: ");
			String name=sc.next();
			
			generator.writeStringField("name", name);	//for write string type data into json file..
			
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			
			generator.writeNumberField("age",age);	//for write integer type data into json file..
			
			
			generator.writeFieldName("Array");	//for write array type data into json file..
			
			generator.writeStartArray();
			System.out.println("How many elements you want to store: ");
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				System.out.println("Enter elements: ");
				generator.writeNumber(sc.nextInt());
				
			}
			
			generator.writeEndArray();	//we must should have to end the generator to stop writing values into array which we started.. 
			
			generator.writeEndObject();	//we must should have to end the generator to stop writing values into object which we started.. 
			
			generator.close(); 
			sc.close();
			
			
			//for read the value from json file...
			
			ObjectMapper mapper=new ObjectMapper();
			@SuppressWarnings("unchecked")
			Map<Object, Object> map=mapper.readValue(new File("D:\\Binding.json"), Map.class);
			
			System.out.println("\nName is: "+map.get("name"));
			System.out.println("Age is: "+map.get("age"));
			System.out.println("Array is: "+map.get("Array"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
