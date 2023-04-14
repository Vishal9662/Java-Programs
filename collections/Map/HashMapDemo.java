package collections.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();

//		hm.put(null, "GF"); //Map allows only one null but values can multiple, but it is gives while sorting..
		hm.put(1, "HS");
		hm.put(3, "Vishal");
		hm.put(2, "KH");
		hm.put(5, "DM");
		hm.put(4, "Jaydip");
		
//		hm.putAll(hm);//add all data from another map object..
		
		System.out.println(hm);
		
		System.out.println("\nUse of containsKey() Method:-> "+hm.containsKey(1));//check whether given key is present or not
		
		System.out.println("\nUse of containsValue() Method:-> "+hm.containsValue("HS"));//check given value is present or not..
		
		System.out.println("\nUse of entrySet() Method:-> "+hm.entrySet());//It will create set of same element which is present in map
		
		System.out.println("\nUse of equals() Method:-> "+hm.equals(hm));	//compare between two map objects..
		
		System.out.println("\nUSe of get() Method:-> "+hm.get(2));	//get value of given key..
		
		System.out.println("\nUse of isEmpty() Method:-> "+hm.isEmpty());//check map is empty or not..
		
		System.out.println("\nUse of keySet() Method:-> "+hm.keySet());//returns the set of keys...
		
		System.out.println("\nUse of remove() Method:-> "+hm.remove(5));//removes the given key
		
		System.out.println("\nUse of replace() Method:-> "+hm.replace(3, "Vish"));
		
		System.out.println("\nUse of values() Method:-> "+hm.values());//returns the set of values...
		
		System.out.println("\ntraversing the data");
		for(Map.Entry<Integer, String> e:hm.entrySet()) {
			System.out.println(e);
		}
		
		System.out.println("\n");
		hm.entrySet()
		.stream()
//		.sorted(Map.Entry.comparingByKey())
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))   //In reverse order...
		.forEach(System.out::println);
	}	

}


/*
It stores the data into key and value pairs, 
The pairs known as Entity so Map is collection of Entities...
Keys are not allow duplicate but values can be duplicate..
Entry is sub interface if Map interface..ex--> Map.Entry
The initial capacity is 16 and load factor is 0.75
*/