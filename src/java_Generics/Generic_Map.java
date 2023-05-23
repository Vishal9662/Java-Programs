package java_Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generic_Map {

	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<>();
		
		m.put(1, "Vishal");
		m.put(2, "Jaydip");
		
		System.out.println(m);
		
		
		//Get key and values into Set
		Set<Map.Entry<Integer, String>> set=m.entrySet();
		System.out.println(set);
		
		//now traverse set
		Iterator<Map.Entry<Integer, String>> itr=set.iterator();
		while(itr.hasNext()) {
			
			Map.Entry<Integer, String> e=itr.next();
			System.out.println(e.getKey()+" -> "+e.getValue());
			
		}
		
	}
}
