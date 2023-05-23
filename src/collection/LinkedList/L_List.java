package collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class L_List {

	public static void main(String[] args) {
		
		LinkedList<Object> ll=new LinkedList<>();
		ll.add("HS");
		ll.add("Vishal");
		ll.add(19);
		ll.add("Jaydip");
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println("\nAdd element at specified position");
		ll.add(2,"21");
		System.out.println(ll);
		
		System.out.println("\nAdd element at first position By addFirst() Method");
		ll.addFirst(47);
//		ll.removeFirst();//Here we can remove element same as above
		
		System.out.println("\nAdd element at last position By addLast() Method");
		ll.addLast("KH");		
//		ll.removeLast();//Here we can remove element same as above
		
		System.out.println("\nUse of element() Method :-> "+ll.element());
		
		System.out.println("\nTraversing By For Each loop..");
		for(Object o:ll) {
			System.out.println(o);
		}
		
		System.out.println("\nReverse a LinkedList..");
		Iterator<Object> itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}


/*
//It allow the duplicates and maintain the Insertion order...
*/