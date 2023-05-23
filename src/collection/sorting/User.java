package collection.sorting;

public class User implements Comparable<User>{

	int id,age;
	String name;
	
	public User(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return id+"-"+name+"-"+age;
	}
	

	@Override
	public int compareTo(User o) {
//		return this.age-o.age;
		return name.compareTo(o.name);
	}
}