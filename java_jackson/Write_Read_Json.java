package java_jackson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Write_Read_Json {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		//Write JSON data
		JSONObject obj=new JSONObject();
		obj.put(1, "Vishal");
		obj.put(2, "Jaydip");
		
		JSONArray ja=new JSONArray();
		ja.add("ele1");
		ja.add("ele2");
		ja.add("ele3");
		
		
		obj.put("Array ",ja);
		
		
		//store all data into file..
		File file=new File("D:\\Json_Simple.json");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		@SuppressWarnings("resource")
		FileWriter writer=new FileWriter(file);
		writer.write(obj.toJSONString());
		
		System.out.println(obj.toJSONString());

		System.out.println("\nRead data using JSONValue Class");
		String s=JSONValue.toJSONString(obj);
		System.out.println(s);
		
	}
}
