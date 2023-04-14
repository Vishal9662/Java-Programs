package collections.LinkedList;

import java.util.LinkedList;

public class L_List_User {
	public static void main(String[] args) {
		
		User a=new User(1, "HS", 47);
		User a1=new User(2, "Vishal", 21);
		User a2=new User(3, "Jaydip", 19);

		LinkedList<User> ll=new LinkedList<>();
		ll.add(a);
		ll.add(a1);
		ll.add(a2);
		
		System.out.println(ll);
		
		for(Object o:ll) {
			System.out.println(o);
		}
		
	}

}
