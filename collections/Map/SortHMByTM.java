package collections.Map;

import java.util.HashMap;
import java.util.Iterator;

public class SortHMByTM {

	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		m.put(2, "GVH");
		m.put(1, "DMK");
		m.put(3, "GJH");
		
		System.out.println("Iterate element  by Iterator...");
		Iterator<Integer> it=m.keySet().iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());	//If you use this way then you'll get only keys not values..
			int key=(int)it.next();
			System.out.println("Key : "+key+" Value: "+m.get(key));
		}
	}

}
