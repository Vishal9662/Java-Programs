package collection.TreeSet;


public class User implements Comparable<User> {
	
	int id;
	String name;
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return id+" - "+name;
	}
	
	@Override
	public int compareTo(User o) {
		int id1=this.id;
		
		User u=(User) o;
		
		int id2=u.id;
		
		if(id1 < id2)
			return -1;
		else if(id > id2)
			return 1;
		else
			return 0;
	}


	public int compare(Integer o1, Integer o2) {
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		return -i1.compareTo(i2);	//for default sorting in descending
		
//		return i2.compareTo(i1);
		
//		if(i1 < i2)
//			return +1;
//		else if(i1 > i2)
//			return -1;
//		else
//			return 0;
		
//		
		//---------For String...
//		String s1=(String)o1;
//		String s2=o2.toString();
//		
////		return -s1.compareTo(s2);
//		
//		return s2.compareTo(s1);
//	
	}

	

}