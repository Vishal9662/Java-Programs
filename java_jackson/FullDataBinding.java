package java_jackson;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FullDataBinding {

	public static void main(String[] args) throws IOException {
		
		Stud1 std=new Stud1();
		
		File file=new File("D:\\Full Binding.json");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File is created..");
		}
		
		ObjectMapper mapper=new ObjectMapper();
		
		Scanner sc=new  Scanner(System.in);
		
			
			System.out.println("Enter Student Id: ");
			std.setId(sc.nextInt());
			
			System.out.println("Enter Student Name: ");
			std.setName(sc.next());
			
			System.out.println("Enter Student Age: ");
			std.setAge(sc.nextInt());
		
		
		mapper.writeValue(file, std);
		
		System.out.println("\nData written into Full Binding.json file");
		
		System.out.println("\nYour data which is stored in file..");
		Stud1 st=mapper.readValue(file, Stud1.class);
		System.out.println(st);
		
		sc.close();
	}
}


class Stud1 {
	private int id;
	private String name;
	private int age;
	
	
	public Stud1() {
		
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



	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

/*

Full data binding means convert json data from and to any Java Type

simple ma data convert krya ta bt, full data binding ma aapde convert ny krie nd direct json data j file write and read krsu..
*/