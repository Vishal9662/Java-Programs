package collections.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhs=new LinkedHashMap<>();
		lhs.put(1, "HS");
		lhs.put(3, "Vishal");
		lhs.put(4, "Jaydip");
		lhs.put(2, "KH");
		lhs.put(5, "DM");
		
		System.out.println(lhs);
		
		System.out.println("\nKeys:-> "+lhs.keySet());
		
		System.out.println("\nValues:-> "+lhs.values());
		
		System.out.println("\nKey-Values Pairs by entrySet() :-> "+lhs.entrySet());
		
		//-------------------------------------------------------------------------------------------------
		System.out.println("\nAfter adding User object...");
		LinkedHashMap<Integer, User> lh=new LinkedHashMap<Integer, User>();
		
		lh.put(3, new User(3, "Vishal", 21));
		lh.put(1, new User(1, "HS", 47));
		lh.put(4, new User(4, "Jaydip", 19));
		lh.put(2, new User(2, "KH", 42));
		
		System.out.println(lh);
		
		System.out.println("\nIterating by for each...");
		for(Map.Entry<Integer, User> en:lh.entrySet()) {
			System.out.println(en);
		}

	}
}


/*
It maintain the insertion order...
*/