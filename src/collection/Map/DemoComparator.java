package collection.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Agecomparator implements Comparator<User>{

	//sorting based on age...
	@Override
	public int compare(User o1, User o2) {//For sorting by age.....
				
				if(o1.age==o2.age)
					return 0;
				else if(o1.age>o2.age)
					return 1;
				else
					return -1;
				
	}

	
}

public class DemoComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		
		//For sorting by name...
		return o1.name.compareTo(o2.name);
		
	}
	
	
	public static void main(String[] args) {
		List<User> al=new ArrayList<User>();
		al.add(new User(1, "Vishal", 21));
		al.add(new User(2, "HS", 47));
		al.add(new User(3, "KH", 42));
		al.add(new User(4, "Jaydip", 19));
			
		System.out.println(al);
		//For sorting based on age...
		System.out.println("\nSorting based on age...");
		Collections.sort(al,new Agecomparator());
		for(User o:al) {
			System.out.println(o);
		}
		
		//For sorting based on name...
		System.out.println("\nSorting based on name...");
		Collections.sort(al,new DemoComparator());
		for(User u:al) {
			System.out.println(u);
		}
		
	}

}