package collections.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Object> lhs=new LinkedHashSet<>();
		lhs.add("HS");
		lhs.add("Vishal");
		lhs.add("Jaydip");
		lhs.add(47);
		lhs.add(21);
		lhs.add(19);
		
		System.out.println(lhs);
		
		lhs.remove(19);
		System.out.println("After removing element: "+lhs);
		
		System.out.println(lhs.remove(52)); //false condition..
		
		
		System.out.println("\nTraversing by for each loop..");
		for(Object o:lhs) {
			System.out.println(o);
		}
		
//---------------------------------------------------------------------------------------------
		
		System.out.println("\nBy adding user object..");
		Set<User> lhsu=new LinkedHashSet<User>();
		lhsu.add(new User(1, "HS", 47));
		lhsu.add(new User(2, "Vishal", 21));
		lhsu.add(new User(3, "Jaydip", 19));
		
		System.out.println(lhsu);
		
		System.out.println("\nTraversing By Iterator Interface...");
		Iterator<User> it=lhsu.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

/*
LinkedHashSet class contains unique elements only like HashSet.
LinkedHashSet class provides all set operations and permits null elements.
LinkedHashSet class maintains insertion order.
But LinkedHashSet is costly for CPU, so if insertion is not required then go with HashSet and HashMap..
*/