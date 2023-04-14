package collections.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class T_Set_User {
	
	public static void main(String[] args) {
//		TreeSet<String> tu=new TreeSet<>(new User());	//If we don't pass user object then JVM internally goes through compareTo() method..
														//If you want to custom sorting then add the user object..
//		tu.add(25);
//		tu.add(21);
//		tu.add(65);
//		tu.add(32);
//		tu.add(85);
//		tu.add(74);
		
//		tu.add("HS");
//		tu.add("Vishal");
//		tu.add("KH");
//		tu.add("JH");
//		
//		System.out.println(tu);
		//-------------------------------------------------------
		
		User u1=new User(1, "HS");
		User u2=new User(3, "Vishal");
		User u3=new User(4, "Jaydip");
		User u4=new User(2, "KH");
		
//		TreeSet<User> t1=new TreeSet<User>();
//		t1.add(u1);
//		t1.add(u2);	//o1.compareTo(o2), o2 means which is already stored..
//		t1.add(u3);
//		t1.add(u4);
//		
//		System.out.println(t1); 
		
		//--------------------------------------
		TreeSet<User> t=new TreeSet<User>(new MyComparator());
		t.add(u1);
		t.add(u2);
		t.add(u3);
		t.add(u4);
		
		System.out.println(t);
	}

}



	
//class User implements Comparable<User> {
//	
//	int id;
//	String name;
//	
//	public User(int id, String name) {
//		this.id=id;
//		this.name=name;
//	}
//	
//	@Override
//	public String toString() {
//		return id+" - "+name;
//	}
//	
//	@Override
//	public int compareTo(User o) {
//		int id1=this.id;
//		
//		User u=(User) o;
//		
//		int id2=u.id;
//		
//		if(id1 < id2)
//			return -1;
//		else if(id > id2)
//			return 1;
//		else
//			return 0;
//	}
//
//}
