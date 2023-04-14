package collections.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		List<Object> li=new LinkedList<Object>();
		
		li.add("HS");
		li.add("KH");
		li.add("Vishal");
		li.add("Jaydip");
		
		System.out.println(li);
		
		System.out.println("\nIterating By ListIterator Interface...");
		ListIterator<Object> it=li.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nIterating in descending by hasPrevious() Method..");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		
		
	}

}
