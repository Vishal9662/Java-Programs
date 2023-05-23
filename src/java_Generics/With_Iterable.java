//If you want to create own collection class then you must implement the Iterable interface...

package java_Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class With_Iterable{

	public static void main(String[] args) {
		User u=new User(1, "Vish");
		User u1=new User(2, "GFD");
		
		UserList list=new UserList();
		list.addUser(u);
		list.addUser(u1);
				
		for(User ur:list) {
			System.out.println(ur);
		}
		
		System.out.println();
		Iterator<User> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	
}

class UserList implements Iterable<User>{

	private List<User> userList=new ArrayList<>();
	
	
	public void addUser(User u) {
		this.userList.add(u);
	}
	
	public void removeUser(User u) {
		this.userList.remove(u);
	}
	
	@Override
	public Iterator<User> iterator() {
		return this.userList.iterator();
	}
	
}

class User{
	public int id;
	public String name;
	
	public User() {
	}
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return id+", "+name;
	}
}