package collections.LinkedHashSet;

public class User {

	int id,age;
	String name;
	
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
