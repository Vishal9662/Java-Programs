package java_jackson;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class Demo_JsonParser {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\Streaming.json");
		file.createNewFile();
		
		JsonFactory factory=new JsonFactory();
		
		JsonGenerator generator=factory.createGenerator(file, JsonEncoding.UTF8);
		
		Scanner sc=new Scanner(System.in);
		
		 generator.writeStartObject();
		 
		 System.out.println("Enter Id: ");
		 int id=sc.nextInt();
		 generator.writeNumberField("id", id);
		 
		 System.out.println("Enter Name: ");
		 String name=sc.next();
		 generator.writeStringField("name", name);
		 
		 generator.writeFieldName("Array");

		 generator.writeStartArray();
		 
		 System.out.println("How many elements you want to store: ");
		 int n=sc.nextInt();
		 		 
		 for(int i=1;i<=n;i++) {
			 System.out.println("Enter Elements: ");
			 generator.writeNumber(sc.nextInt());
		 }
		 		 
		 
		 generator.writeEndArray();
		 generator.writeEndObject();
		 
		 
		 generator.close();
		 sc.close();
		 
		 System.out.println("\nReading data using JsonParser Class..");
		 //--------------- Read data from file using JsonParser --------------------
		 JsonParser parser=factory.createParser(file);	
		 
		 while(parser.nextToken() != JsonToken.END_OBJECT) {	//Here we use nextToken() to read each Json string as token..
			
			 String fieldName=parser.getCurrentName();	//get current token..
			 
			 if("id".equals(fieldName)) {
				 parser.nextToken();	//move to next token..
				 System.out.println("Id is: "+parser.getIntValue());
			 }
			 
			 if("name".equals(fieldName)) {
				 parser.nextToken();
				 System.out.println("Name is: "+parser.getText());
			 }
			 
			 if("Array".equals(fieldName)) {
				 parser.nextToken();
				 
				 while(parser.nextToken() != JsonToken.END_ARRAY) {
					 System.out.println("Elements is: "+parser.getIntValue());
				 }
			 }
		 }
		 

	}
}
