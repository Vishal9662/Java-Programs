package java_json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.*;

public class JsonToFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		JSONObject obj=new JSONObject();
		obj.put("id", 1);
		obj.put("name", "Vishal");
		obj.put("salary", 21145.21);
		obj.put("IsGoodDeveloper", true);
		
		System.out.println("In JSON format...");
		System.out.println(obj);
		
		
		System.out.println("\nTo store Json data into file..");
		
		File file=new File("D:\\Student.json");
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("Json File is created..");
		}
		
		
		FileWriter writer=new FileWriter(file);
		writer.write(obj.toJSONString());
		
		writer.close();
		
		System.out.println("Data stored into Json File..");
		
	}
}