package collection.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, String> ht=new Hashtable<>();
		
		ht.put("Hrr", "One");
		ht.put("bdf", "Four");
		ht.put("FD", "Five");
		ht.put("RTR", "Two");
		ht.put("DSF", "Three");
		
		System.out.println(ht);
		
		System.out.println("\ntraversing....");
		for(Map.Entry<String, String> m:ht.entrySet()) {
			System.out.println(m);
		}
		
		
		//------------------------------------------------------------------------------------------------
		System.out.println("\nAdding user object into Hashtable object...");
		Hashtable<String, User> htu=new Hashtable<>();
		htu.put("One ", new User(1, "HS", 47));
		htu.put("Three ", new User(3, "Vishal", 21));
		htu.put("Two ", new User(2, "KH", 42));
		htu.put("Four ", new User(4, "Jaydip", 19));
		
		System.out.println(htu);
		
		for(Map.Entry<String, User> me:htu.entrySet()) {
			System.out.println(me);
		}
	}
}


/*

It not allow duplicates and null keys and values..
It is a synchronized...
The initial capacity is 11 and load factor is 0.75
*/