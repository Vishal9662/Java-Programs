package updates;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		Stream<Object> stream=Stream.empty();	//it creates empty object of stream.
		
		Integer arr[]= {1,2,3,4,5};
		Stream<Integer> str=Stream.of(arr);	//creating object of stream
		
		str.forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("\nIn collection..");
		//create object in collection..
		List<Integer> l=new ArrayList<>();
		l.add(45);
		l.add(63);
		l.add(65);
		
		Stream<Integer> st=l.stream();	//here is also object is created..
		st.forEach(e -> {
			System.out.println(e);
		});
		
		
	}
}
