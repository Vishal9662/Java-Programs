package java_Generics;

import java.util.HashSet;
import java.util.Set;

public class Generic_Set {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
//		set.add("fdf");//compile time error
		
		set.add(650);
		set.add(24);
		set.add(65);
		
		
		System.out.println(set);
	}
}
