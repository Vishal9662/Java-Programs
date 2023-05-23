package collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		Person p1=(Person)o1;
		Person p2=(Person)o2;

		String s1=p1.name;
		String s2=p2.name;
		
		return s1.compareTo(s2);
	}

}