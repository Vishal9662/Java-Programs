package updates;

import java.util.Arrays;
import java.util.List;

public class MR_InCollection {

	public static void main(String[] args) {
		
		List<Integer> ints=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(ints);
		
		ints.stream().forEach(System.out::println);
		
	}
}
