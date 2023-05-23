package collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		
		l.add("HS");
		l.add("Vishal");
		l.add("KH");
		l.add("Jaydip");
//		l.add(null); //It not allow null values, It will throw exception...
		
		System.out.println("By default" + l);
		
		l.add(2, "DM");	//Add element at specific position...
		
		System.out.println("\nBy For Loop..");
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+", ");//get element by get method
		}
		
		l.set(4, "Element");	//Set element at specific position
		
		Iterator<String> itr=l.iterator();
		System.out.println("\nIterating By Iterator Interface");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nIterating By List Iterator Interface in Previous order with hasPrevious");
		ListIterator<String> li=l.listIterator(l.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("\nIterating By List Iterator Interface in forward order with hasNext");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("\nBy For each loop..");
		for(Object o:l) {
			System.out.println(o);
		}
		
		System.out.println("\nBy forEachRemaining() Method...");
		Iterator<String> itr1=l.iterator();
		itr1.forEachRemaining(a->
		{
			System.out.println(a);
		});
		
		System.out.println("\nAnother List...");
		List<String> list=new ArrayList<>();
		list.add("FDS");
		list.add("TRS");
		list.add("GFD");
		list.add("ASD");
		Collections.sort(list);
		System.out.println("After sorting list2 "+list);
		
		
		System.out.println("\nAdding list into another list...");
		l.addAll(list);
		
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println("\nAfter Sorting in ascending By sort() :-> "+l);	
		
		System.out.println("\nUse of remove() Method..");
		
		l.remove("FDs");//By given element...
//		l.remove(7);	//By Index position...
		
//		l.removeIf(n -> n.charAt(0)=='e');//By removeIf() Method., If given element is present in collection then it will remove it..
		
		System.out.println("After removing "+l);
		
		System.out.println("\nFind element index position by using indexOf() Method:-");
		System.out.println(l.indexOf("Vishal"));
		
		System.out.println("\nFind element by using contains() Method:-");
		System.out.println("Is 'HS' present ? "+l.contains("HS"));
		
//		System.out.println("\nAfter removeIf() Method...");
//		li1.removeIf(st -> li1.contains("KV"));
		
		System.out.println("\nSorting in Descending Order..");
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);

		
		l.retainAll(list);
		System.out.println("\nIterating the elements after retaining the elements of al2");
		System.out.println(l);
		
		
		//-------------------------------------------------------------------------------------------------------------
		
				System.out.println("\nDemo of ArrayList with passing User object..");
				
				User a=new User(1, "HS", 47);
				User a1=new User(5, "Vishal", 21);
				User a2=new User(3, "Jaydip", 119);
				
				List<User> list1=new ArrayList<User>();
				list1.add(a);
				list1.add(a1);
				list1.add(a2);
				list1.add(new User(2,"KH",42));
				list1.add(new User(4,"DM",23));
						
				System.out.println(list1);
				
				Set<User> set=new HashSet<User>(list1);
				System.out.println("\nAfter adding in Set..");
				System.out.println(set);
						
				System.out.println("\nGet Element By get() Method..");
				System.out.println("The element on 0th index is :-> "+list1.get(0));

				System.out.println("\nTraversing By For loop");
				for(int i=0;i<list1.size();i++) {
					System.out.println(list1.get(i));
				}
				
				System.out.println("\nTraversing By For each Loop...");
				for(User user:set) {
					System.out.println(user);
				}
				
				System.out.println("\nTravesring By Iterator Interface..");
				Iterator<User> itr11=set.iterator();
				while(itr11.hasNext()) {
					System.out.println(itr11.next());
				}
				
				System.out.println("\nTraversing By forEachRemaining() Method..");
				Iterator<User> itr111=set.iterator();
				itr111.forEachRemaining(at->{
					System.out.println(at);
				});

		
	}

}
