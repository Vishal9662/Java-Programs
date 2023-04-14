package collections.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<>();
		
		ht.put(101, "One");
		ht.put(104, "Four");
		ht.put(105, "Five");
		ht.put(102, "Two");
		ht.put(103, "Three");
		
		System.out.println(ht);
		
		System.out.println("\ntraversing....");
		for(Map.Entry<Integer, String> m:ht.entrySet()) {
			System.out.println(m);
		}
		
		
		//------------------------------------------------------------------------------------------------
		System.out.println("\nAdding user object into Hashtable object...");
		Hashtable<String, User> htu=new Hashtable<>();
		htu.put("One", new User(1, "HS", 47));
		htu.put("Three", new User(3, "Vishal", 21));
		htu.put("Two", new User(2, "KH", 42));
		htu.put("Four", new User(4, "Jaydip", 19));
		
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