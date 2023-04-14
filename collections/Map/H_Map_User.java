package collections.Map;

import java.util.HashMap;
import java.util.Map;

public class H_Map_User {

	public static void main(String[] args) {
		Map<Integer, User> hmu=new HashMap<Integer, User>();
		
		hmu.put(1, new User(1, "HS", 47));
		hmu.put(3, new User(3, "Vishal", 21));
		hmu.put(2, new User(2, "KH", 42));
		hmu.put(5, new User(5, "DM", 23));
		hmu.put(4, new User(4, "Jaydip", 19));

		System.out.println(hmu);
		
		System.out.println("\ntraverse the data...");
		for(Map.Entry<Integer, User> e:hmu.entrySet()) {
			System.out.println(e);
		}
		
	}

}
