package collections.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValue {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "HS");
		m.put(5, "Jaydip");
		m.put(2, "KH");
		m.put(4, "Vishal");
		m.put(3, "DM");
		
		System.out.println("Map elements:-> "+m);
		
		//sorting By Value.....
		List<String> l=new ArrayList<>();
		LinkedHashMap<Integer, String> lm=new LinkedHashMap<Integer, String>();
		
		for(Map.Entry<Integer, String> e:m.entrySet()) {
			l.add(e.getValue());
		}
		
		Collections.sort(l, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o1).compareTo(o2);
			}
		});
		
		System.out.println("\nSorting Based on Values...");
		for(String str : l) {
			for(Entry<Integer, String> en:m.entrySet()) {
				if(en.getValue().equals(str)) {
					lm.put(en.getKey(), str);
				}
			}
		}
		
		System.out.println(lm);
		
	}
}
