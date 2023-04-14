package collections.Map;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
//		SortedMap<Integer, String> tm=new TreeMap<>();//Here if we can also use sortedMap Interface instead of TreeMap or Map..
		TreeMap<Integer, String> tm=new TreeMap<>();
		tm.put(47, "HS");
		tm.put(19, "Jaydip");
		tm.put(21, "Vishal");
		tm.put(23, "DM");
		tm.put(42, "KH");
		
		System.out.println(tm);
		
//		System.out.println("\nIn descending order :-> "+tm.descendingMap());
		
		System.out.println("\nheadMap():-> "+tm.headMap(23));
		
		System.out.println("\ntailMap():-> "+tm.tailMap(23));
		
		System.out.println("\nsubMap():-> "+tm.subMap(19, 42));
		
		System.out.println("\ntraverse elements...");
		for(Map.Entry<Integer, String> m:tm.entrySet()) {
			System.out.println(m);
		}
		
		
		//-------------------------------------------------------------------------------------------------
		System.out.println("\nAdding a User object into TreeMap");
		TreeMap<Integer, User> tu=new TreeMap<Integer, User>();
		tu.put(1, new User(47, "HS", 1));
		tu.put(4, new User(19, "Jaydip", 4));
		tu.put(5, new User(23, "DM", 5));
		tu.put(2, new User(42, "KH", 2));
		tu.put(3, new User(21, "Vishal", 3));

		System.out.println(tu);

		System.out.println("\ntraverse the user object data....");
		for(Map.Entry<Integer, User> m:tu.entrySet()) {
			System.out.println(m);
		}
		
		
	}
}


/*
It returns the element in sorted format..
It contains only unique elements.
*/