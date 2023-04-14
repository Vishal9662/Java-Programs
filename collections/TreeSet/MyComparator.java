package collections.TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		User u1=(User)o1;
		User u2=(User)o2;
		
		String s1=u1.name;
		String s2=u2.name;
		
		return s1.compareTo(s2);
	}
	
}