package collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SomeMethods {

	public static void main(String[] args) {
		
		List<Object> list=new ArrayList<Object>();
		list.add("Vishal");
		list.add(65);
		list.add("Vishal");
		list.add(32);
		list.add(65);
		
		System.out.println(list);
		
		Set<Object> s=new HashSet<Object>(list);
		System.out.println("\nAfter using HashSet : ");
		System.out.println(s);
		
		System.out.println("\n Reverse ArrayList :");
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println("\n Make ArrayList Read Only ");
		List<Object> ul=Collections.unmodifiableList(list);
//		ul.add("FSD");	//We are not able to modify this list after store it in Collections.unmodifiableList() Method...
		System.out.println(ul);
		
		System.out.println("\nList to Array Conversion...");
		Object item[]=list.toArray(new Object[list.size()]);	//Convert into Array from list..
		
		for(Object o:item) {
			System.out.println(o);
		}
		
		System.out.println("\nArray to List Conversion...");
		List<Object> l=new ArrayList<Object>();
		l=Arrays.asList(item);	//Convert into List from Array..
		System.out.println(l);
		
		//----------- synchronize the ArrayList ----------------
		System.out.println("\nSynchronize the ArrayList");
		list=Collections.synchronizedList(list);
		
		synchronized (list) {
			for(Object o:list) {
				System.out.println(o);
			}
		}
		
	}
}
