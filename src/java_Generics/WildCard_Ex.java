package java_Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard_Ex {

	public static void main(String[] args) {
		
		//Ex of UpperBounded WildCards...
		List<Integer> l=new ArrayList<Integer>();

		l.add(54);
		l.add(32);
		l.add(65);
		
		System.out.println(l);
		
		System.out.println("\nrepresenting the UpperBounded WildCard..");
		System.out.println("Sum of Integer: "+sum(l));
		
		System.out.println("\nrepresenting the LowerBounded WildCard..");
		addNum(l);
		
		System.out.println("\nrepresenting the Unbounded WildCard..");
		meth(l);
		
	}
	
	
	//For represent the UpperBounded WildCard 
	static Integer sum(List<? extends Number> l1) {	//UpperBounded WildCard...
		int s=0;
		for(Number n:l1) {
			s=s+n.intValue();
		}
		
		return s;
	}
	
	//For represent the LowerBounded WildCard
	static void addNum(List<? super Integer> li) {
		for(Object o:li) {
			System.out.println(o);
		}
	}
	
	//For representing the Unbounded WildCard
	static void meth(List<?> l1) {
		for(Object o:l1) {
			System.out.println(o);
		}
	}
}

/*
	'?' mark represents wildcard, Nd here we used Number as wildcard, so that is UpperBounded WildCard.. 
*/