package java_Annotation;

import java.util.ArrayList;
import java.util.List;

public class Anno_SuppressWarnings {

	@SuppressWarnings({  "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List l=new ArrayList();
		
		l.add("ds");
		l.add(650);
		
		System.out.println(l);
	}
}

//when you don't give generic then it will give compile time warning..