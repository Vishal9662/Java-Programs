package Demo_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Person p =new Person(1, "HS", 47);
		Person p1=new Person(2, "KH", 42);
		Person p2=new Person(3, "DM", 23);
		Person p3=new Person(4, "Vishal", 21);
		Person p4=new Person(5, "Jaydip", 19);
		
		List<Person> list=new ArrayList<Person>(); 
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		System.out.println(list);
		
		System.out.println("\nAdding another list into previous list..");
		Person p5=new Person(6, "Komal", 21);
		List<Person> list1=new LinkedList<>();
		list1.add(p5);
		list1.add(p5);
		System.out.println(list1);
		
		list.addAll(list1);	//merge multiple lists  
		
		System.out.println("\nTraverse data by for each loop");
		for(Person pe:list) {
			System.out.println(pe);
		}
		
		//remove duplicate using HashSet..
		System.out.println("\ntremove duplicate from list..");
		Set<Person> set=new HashSet<Person>();
		set.addAll(list);
		
		System.out.println(set);
		
		System.out.println("\nAdd HashSet object into TreeSet..");
		Set<Person> tSet=new TreeSet<Person>();	//If here you want to sort based on name then give object of MyComparator in Constructor..
												//ex. TreeSet<Person>(new MyComparator)();
		tSet.addAll(set);
		System.out.println(tSet);


		System.out.println("\nSorting based on Id/ Name/ Age...");
		Iterator<Person> itr=tSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//------------------------------------------------------------------------------------------------------------------------
		System.out.println("\n\n---------------------------------------------------------------------------------------------------");
		System.out.println("\n\nDemo for Map is started from Here...");
		
		Map<Object, Person> map=new HashMap<Object, Person>();
		map.put(1, p);
		map.put(2, p1);
		map.put(3, p2);
		map.put(4, p3);
		map.put(5, p4);
		
		System.out.println(map);
		
		Map<Object, Person> lhm=new LinkedHashMap<>();
		lhm.put(0, p);
		
		map.putAll(lhm);
		
		System.out.println("\nAdd Map object into TreeSet");
		Map<Object, Person> tMap=new TreeMap<Object, Person>();
		tMap.putAll(map);
		
		System.out.println(tMap);
		
//		Collections.sort(new Comparator() {
//		@Override
//		public int compare(Object o1, Object o2) {
//			return (o1).compareTo(o2);
//		}
//			
//		});
		
		System.out.println("\nsorting based on Values...");
		for(Map.Entry<Object, Person> e:tMap.entrySet()) {
			System.out.println(e);
		}


		
		
	}
}
