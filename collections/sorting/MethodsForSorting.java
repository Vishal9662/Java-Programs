package collections.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class MethodsForSorting {

	public static void main(String[] args) {
		
		String arr[]= {"Vi","sh","al","KV"};
		System.out.println("Elements of Array are :-> "+Arrays.toString(arr));
		
		System.out.println("\nFrom Array to List....");
		List<String> list=Arrays.asList(arr);
		System.out.println(list);
		
		System.out.println("\nBy using Collections.addAll()...");
		List<String> list1=new ArrayList<String>();
		Collections.addAll(list1,arr);//convert from array into list
		System.out.println(list1);
		
		System.out.println("\nBy using stream().collect() method: ");
		List<String> al1=Arrays.stream(arr).collect(toList());
		System.out.println(al1);
		
		//---------------------------------------------------------------------------------------------------------
		List<String> al=new ArrayList<>();
	
		al.add("HS");
		al.add("Vishal");
		al.add("Jaydip");
		
		System.out.println("\nElement of ArrayList :-> "+al);
		
		Collections.sort(al);
		System.out.println("\nAfter sorting by sort() :");
		System.out.println(al);
		
		System.out.println("\nAfter sorting in reverse order by reverseOrder() :");
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		//------------------------------------------------------------------------------------------------
		System.out.println("\nAdding user object into List..");
		
		List<User> l=new ArrayList<User>();
		l.add(new User(1, "HS", 47));
		l.add(new User(2, "KH", 42));
		l.add(new User(3, "DM", 23));
		l.add(new User(4, "Vishal", 21));
		l.add(new User(5, "Jaydip", 19));
		
		System.out.println(l);
		
		System.out.println("\nAfter sorting by name");
		Collections.sort(l);
		System.out.println(l);
	

	}

}
