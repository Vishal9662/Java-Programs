package java_Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic_List {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("FG");
//		list.add(54);	//compile time error
		
		
		String s=list.get(0);	//type casting is not required..
//		String s=(String) list.get(0);	//If we not use generics then we have to go through this..
		
		System.out.println(s);
	}
}


/*
	Types Of Generics :
	K - Key
	V - Value
	T - Type
	E - Element
	N - Number
	
*/