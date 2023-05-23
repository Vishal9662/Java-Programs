package logical;

import java.util.ArrayList;
import java.util.List;

public class _1 {

	public static void main(String[] args) {
		Emp e=new Emp(1, "abc", 15000);
		Emp e1=new Emp(2, "xyz", 1254.0);
		Emp e2=new Emp(3, "asd", 5478.0);
		
		List<Emp> al=new ArrayList<>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		System.out.println(al);
		
		List<Emp> al1=new ArrayList<>();
		al1.addAll(al);
		System.out.println(al1);
		
	}
	
}
