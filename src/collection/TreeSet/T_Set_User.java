package collection.TreeSet;

import java.util.TreeSet;

public class T_Set_User {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> tu=new TreeSet<Integer>();	//new User()	//If we don't pass user object then JVM internally goes through compareTo() method..
														//If you want to custom sorting then add the user object..
		tu.add(25);
		tu.add(21);
		tu.add(65);
		tu.add(32);
		tu.add(85);
		tu.add(74);
		
//		tu.add("HS");
//		tu.add("Vishal");
//		tu.add("KH");
//		tu.add("JH");
		
		System.out.println("By default TreeSet sorting-> "+tu);
		
		//-------------------------------------------------------
		
		User u1=new User(1, "HS");
		User u2=new User(3, "Vishal");
		User u3=new User(4, "Jaydip");
		User u4=new User(2, "KH");
		
		TreeSet<User> t1=new TreeSet<User>();
		t1.add(u1);
		t1.add(u2);	//o1.compareTo(o2), o2 means which is already stored..
		t1.add(u3);
		t1.add(u4);
		
		System.out.println("After sorting based on id from User class with Comparable-> "+t1); 
		
		//--------------------------------------
		TreeSet<User> t=new TreeSet<User>(new MyComparator());
		t.add(u1);
		t.add(u2);
		t.add(u3);
		t.add(u4);
		
		System.out.println("After sorting based on name from MyComparator class with Comparator-> "+t);
	}

}
