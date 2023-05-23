package collection.Queue;

public class User implements Comparable<User> {

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

	@Override
	public int compareTo(User o) {
		if(id>o.id)
			return 1;
		else if(id<o.id)
			return -1;
		else
			return 0;
	}
}