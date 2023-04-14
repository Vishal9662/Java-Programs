package java_jackson;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataBinding {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many students you want to store..");
		int n=sc.nextInt();
		
		Stud std=new Stud();	//creating object of Stud class
		
		Map<Object, Object> map=new HashMap<>();
		
		
		
		for(int i=1;i<=n;i++) {
			
			System.out.println("Enter Student Id: ");
			int sid=sc.nextInt();
			std.setId(sid);
			
			System.out.println("Enter Student Name: ");
			std.setName(sc.next());
			
			System.out.println("Enter Student Age: ");
			std.setAge(sc.nextInt());
			
			System.out.println("Enter Student Phone Number: ");
			std.setPhoneNum(sc.nextLong());
			
			map.put(sid, std);
		}
		
		ObjectMapper mapper=new ObjectMapper();
		
		File file=new File("D:\\Binding.json");
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File is created..");
		}
		
		mapper.writeValue(file, map);
		
		System.out.println("Data written into Binding.json file..");
		
		
		//For display data into console which is stored into map...
		
		Map<Object, Object> readData=mapper.readValue(file, Map.class);
		
		for(Map.Entry<Object, Object> entry:readData.entrySet())
		{
			System.out.println(entry);
			System.out.println("Key is: "+entry.getKey()+" Value is: "+entry.getValue());
			
		}
		
		
		sc.close();
	}
}


class Stud{
	private int id;
	private String name;
	private int age;
	private long phoneNum;
	
	
	public Stud() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", age=" + age + ", phoneNum=" + phoneNum + "]";
	}
	
	
}

/*
Simple Data Binding means convert json data to and from Map, List, Strings, Numbers, etc..

ObjectMapper is used for write and read data into json file

JSON Type					Java Type
-------------------------------------------------------------
object					|	LinkedHashMap<String,Object>	|
array					|	ArrayList<Object>				|
string					|	String							|
Number					|	Integer, Long or BigInteger		|
fractional number		|	Double / BigDecimal				|
true | false			|	Boolean							|
null					|	null							|
-------------------------------------------------------------

*/