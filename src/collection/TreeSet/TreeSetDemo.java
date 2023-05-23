package collection.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Object> t1=new TreeSet<Object>();
//		t1.add("HS");
//		t1.add("Vishal");
//		t1.add("Jaydip");
		
		t1.add(47);
		t1.add(21);
		t1.add(19);
		t1.add(42);
		t1.add(23);
		
		System.out.println(t1);
		
				
		System.out.println("\nUse of first() Method:-> "+t1.first());//returns first element
		
		System.out.println("\nUse of last() Method:-> "+t1.last());//returns last element
		
		System.out.println("\nUse of headSet() Method:-> "+t1.headSet(23));//returns all previous element of given element
		
		System.out.println("\nUse of tailSet() Method:-> "+t1.tailSet(23));//returns all next element of given element 
		
		System.out.println("\nUse of subSet() Method:-> "+t1.subSet(21, 47));//returns between element of given elements..
		
		System.out.println("\nUse of comparator() Method:-> "+t1.comparator());//This method will return the Comparator to sort elements in TreeSet
																				//but it will return null, if the default natural sorting order is already used..
		
		System.out.println("\nUse of pollFirst() Method:-> "+t1.pollFirst());//returns first element
		
		System.out.println("\nUse of pollLast() Method:-> "+t1.pollLast());//returns last element
		
		System.out.println("\nIn descending order"+t1.descendingSet());

		
		System.out.println("\ntraversing by for each loop..");
		for(Object o:t1) {
			System.out.println(o);
		}
	}
}


/*
TreeSet class contains unique elements only like HashSet.
TreeSet class access and retrieval times are quite fast.
TreeSet class doesn't allow null elements.
TreeSet class is non-synchronized.
TreeSet class maintains ascending order.
In TreeSet heterogeneous is not allowed.. 

It internally uses a binary search tree, and it stores data into tree format.
If the element is bigger then current then it will store to right side,
and If element is lesser then current then it will store to left side..

It implements the SortedSet Set Interface, it has some special methods, like..
first(), last(), headSet(), tailSet(), subSet(), comparator(), this all methods explained while executing it..

*/