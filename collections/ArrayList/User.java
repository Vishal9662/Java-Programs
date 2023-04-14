package collections.ArrayList;


public class User implements Comparable<User> {
	
	int id;
	String name;
	int age;
	
	public User(int id, String name, int age) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return id+" - "+name+" - "+age;
	}

	@Override
	public int compareTo(User user) {
		if(age == user.age)
			return 0;
		else if(age > user.age)
			return 1;
		else
			return 1;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		
		User er = (User) obj;
		return this.id==er.id;
	}


}
