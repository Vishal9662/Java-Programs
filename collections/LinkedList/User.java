package collections.LinkedList;

public class User {

	int id;
	String name;
	int age;
	
	public User(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+age;
	}
}
