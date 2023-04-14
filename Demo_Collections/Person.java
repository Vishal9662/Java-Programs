package Demo_Collections;

import java.util.Comparator;

public class Person implements Comparable<Person>{

	public int id;
	public String name;
	public int age;
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person -> id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
	//------>  Sorting based on Id
	@Override
	public int compareTo(Person o) {
		return this.age-o.age;
	}


	
}
