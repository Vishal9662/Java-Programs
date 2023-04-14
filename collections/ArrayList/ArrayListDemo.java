/*
See this all sites..
 https://www.tutorialspoint.com/javaexamples/java_collections.htm
 https://javahungry.blogspot.com/2019/02/collection-programs-in-java-for-interview.html
 https://www.w3resource.com/java-exercises/collection/index.php#arraylist
 */

package collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("HS");
		li.add("Vishal");
		li.add("Jaydip");
//		li.add(null); //It not allow null values..
		
		System.out.println("Demo Of Simple ArrayList");
		System.out.println(li);
		
		li.add(1, "KH");	//Add element at specific position...
		
		Collections.sort(li);
		System.out.println("\nAfter Sorting in ascending By sort() :-> "+li);
		
		List<Object> li1=new ArrayList<Object>();
		li1.add("DM");
		li1.add("KV");
		System.out.println("\nAdd Another list object..");	//merge two lists..
		li1.addAll(2,li);
		
		System.out.println(li1);
		
		System.out.println("\nAfter remove() Method...");
		li1.remove("DM");
		System.out.println(li1);
		
		System.out.println("\nFind element index position by using indexOf() Method:-");
		System.out.println(li1.indexOf("Vishal"));
		
		System.out.println("\nFind element by using contains() Method:-");
		System.out.println("Is 'HS' present ? "+li1.contains("HS"));
		
//		System.out.println("\nAfter removeIf() Method...");
//		li1.removeIf(st -> li1.contains("KV"));
		
		System.out.println("\nSorting in Descending Order..");
		Collections.sort(li1, Collections.reverseOrder());
		System.out.println(li1);

		
//-------------------------------------------------------------------------------------------------------------
		
		System.out.println("\nDemo of ArrayList with passing User object..");
		
		User a=new User(1, "HS", 47);
		User a1=new User(5, "Vishal", 21);
		User a2=new User(3, "Jaydip", 119);
		
		List<User> list=new ArrayList<User>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		list.add(new User(2,"KH",42));
		list.add(new User(4,"DM",23));
				
		System.out.println(list);
		
		Set<User> set=new HashSet<User>(list);
		System.out.println("\nAfter adding in Set..");
		System.out.println(set);
				
		System.out.println("\nGet Element By get() Method..");
		System.out.println("The element on 0th index is :-> "+list.get(0));

		System.out.println("\nTraversing By For loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\nTraversing By For each Loop...");
		for(User user:set) {
			System.out.println(user);
		}
		
		System.out.println("\nTravesring By Iterator Interface..");
		Iterator<User> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nTraversing By forEachRemaining() Method..");
		Iterator<User> itr1=set.iterator();
		itr1.forEachRemaining(at->{
			System.out.println(at);
		});

		
	}

}


/*
It don't allow duplicate values
It maintains Insertion order
The initial capacity is 10 and load factor is 100% or 1.
*/