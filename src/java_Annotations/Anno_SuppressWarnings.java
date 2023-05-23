package java_Annotations;

import java.util.ArrayList;
import java.util.List;

public class Anno_SuppressWarnings {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(64);
		l.add("fsd");
		
		System.out.println(l);
	}
}

//In collection, If you don't give generics then it will give compile time warning, To avoid that warning we should use @SuppressWarnings Annotation