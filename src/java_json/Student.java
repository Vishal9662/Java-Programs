package java_json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.*;

public class Student {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		JSONObject obj=new JSONObject();
		
		obj.put("firstName", "Vishal");
		obj.put("lastName", "Gohil");
		obj.put("RollNo", 222);
		obj.put("Fees", 50000);
		
		System.out.println("=====>  Simple Json format  <=====");
		System.out.println(obj);
		
		//For adding another object
		Map<Object, Object> m=new HashMap<>();
		m.put("city", "Ahmedabad");
		m.put("Area", "Shyamla");
		m.put("Street", "VisatBhuvan");
		m.put("PIN", 145454);
		
		//Add Map details into json object
		obj.put("Address",m);
		
		System.out.println("\n=====>  After adding another json object into this object  <======");
		System.out.println(obj);
		
		
		//For Adding Json Array...
		JSONArray ja=new JSONArray();
		
		m=new LinkedHashMap<>();
		m.put("personal_number", 9662034727L);
		
		ja.add(m);
		
		
		//Add another object into array..		
		m=new LinkedHashMap<>();
		m.put("emergency_number", 9316244418L);
		
		ja.add(m);
			
		obj.put("Mobile_Numbers", ja);
		
		System.out.println("\n=====>  After adding Array into Json  <=====");
		System.out.println(obj);
		
		
		//Adding this Json data to File....
		File file=new File("D:\\Student.json");
		FileWriter writer=new FileWriter(file);
		
		writer.write(obj.toJSONString());
		
		writer.close();
		
		System.out.println("\nYour data written into File..");
		
	}
}