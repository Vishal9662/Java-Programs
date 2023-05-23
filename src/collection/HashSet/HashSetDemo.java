package collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Object> s=new HashSet<Object>();
		
		s.add("HS");
		s.add("Vishal");
		s.add("Jaydip");
		s.add(47);
		s.add(21);
		s.add(19);
		s.add(47);	//It ignores this duplicate element..
		
		System.out.println(s);
		
//		System.out.println("\nremove element by remove() method :-> "+s.remove(47));
//		
//		System.out.println("\nUse of splitIterator() Method..");
//		Spliterator<Object> sit=s.spliterator();
//		
//		sit.forEachRemaining(System.out::println);
		
		
		System.out.println("\nTraverse By Iterator Interface..");
		Iterator<Object> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\nTraverse By for Each loop..");
		for(Object o:s) {
			System.out.println(o);
		}
		
		
		//------------------------------------------------------------------------------------------------------
		System.out.println("\nBy Using User Object..");
		Set<User> s1=new HashSet<User>();
		s1.add(new User(1, "HS", 47));
		s1.add(new User(2, "Vishal", 21));
		s1.add(new User(3, "Jaydip", 19));
		s1.add(new User(4, "KH", 42));
		
		System.out.println(s1);
		
		System.out.println("\nTraverse by for each loop");
		for(Object o:s1) {
			System.out.println(o);
		}
	}

}

/*
The HashSet class extends AbstractSet class which implements Set interface.
The Set interface inherits Collection and Iterable interfaces in hierarchical order.
A List can contain duplicate elements whereas Set contains unique elements only.
It don't allow duplicates, It contains only unique values..
It allows null value.
It not maintain the insertion order.
It is best for search operation.
The initial capacity is 16 and load factor is 0.75 or 70%
*/