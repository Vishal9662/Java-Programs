package collection.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortByKeyAndValue {

	public static void main(String[] args) {

		Map<String, String> m=new HashMap<>();
		
		m.put("One", "HS");
		m.put("Two", "KH");
		m.put("Three", "DM");
		m.put("Four", "Vishal");
		m.put("Five", "Jaydip");
		
		System.out.println("Default Elements-> "+m);
		
		//Sort By Keys...
		TreeMap<String, String> tm=new TreeMap<>();
			tm.putAll(m);
			
			System.out.println("\nSort By Keys...");
		for(Map.Entry<String, String> me:tm.entrySet()) {
			System.out.println(me);
		}
		
		
		//Sort By Values...
		System.out.println("\nSort By Values...");
		List<String> list=new ArrayList<>();
		LinkedHashMap<String, String> sort=new LinkedHashMap<>();	//here we use LinkedHashMap because it maintain the insertion order..
		
		//Adding values to List
		for(Map.Entry<String, String> em:m.entrySet()) {
			list.add(em.getValue());
			System.out.println(list);
		}
		
		//Sorting Logic
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
			
		});
		
		//Adding sorted list into map object
		for(String str:list) {
			for(Entry<String, String> en:m.entrySet()) {
				if(en.getValue().equals(str)) {
					sort.put(en.getKey(), str);
				}
			}
		}

		System.out.println("\nSorted By Values :-) "+sort);

	}
}