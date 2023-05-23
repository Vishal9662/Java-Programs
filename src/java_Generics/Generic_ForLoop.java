package java_Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic_ForLoop {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		
		l.add("FD");
		l.add("DS");
		l.add("RF");
		l.add("er");
		
		System.out.println(l);
		
		//this is generic type for loop, if type is not matched then it will give compile time error
		for(String s:l) {
			System.out.println(s);
		}
		
		
	}
}


//generic has special type of loop that is "for each" loop...
//It's used for iterating collection type of data...