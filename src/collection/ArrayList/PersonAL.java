package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;


class Person {
	
	int id;
	String name;
	int age;
	
	Person(int id, String name, int age) {
			this.id=id;
			this.name=name;
			this.age=age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age ;
	}
	
}


public class PersonAL {

	public static void main(String[] args) {
		
		Person p2=new Person(11, "HS", 47);
		Person p =new Person(1, "Vishal", 20);
		Person p1=new Person(2, "Jaydip", 18);
		
		List<Person> list=new ArrayList<Person>();
		list.add(p2);
		list.add(p);
		list.add(p1);
		
		System.out.println(list);
		
		for(Object o1:list) {
			System.out.println(o1);
		}
		
	} 
}


