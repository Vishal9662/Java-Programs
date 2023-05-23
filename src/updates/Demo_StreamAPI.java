package updates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo_StreamAPI {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // jyare aavi rite list create krsu tyare psi e final thy jse ema psi data modify ny kri skie..

//		list.remove(2);

		System.out.println(list);

		// Another way of create list..
		System.out.println("\nusing Arrays class..");
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list1);

		// without stream (boilerplate code..)
		List<Integer> even = new ArrayList<>();

		for (Integer i : list) {
			if (i % 2 == 0) {
				even.add(i);
			}
		}

		System.out.println("\nOnly Even numbers without stream: ");
		System.out.println(even);

		// with using stream..
		Stream<Integer> stream = list.stream();
		List<Integer> evenList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("\nOnly even numbers with using stream: ");
		System.out.println(evenList);

		// same thing with stream
		List<Integer> el = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()); // filter ma aapde condition nakhie and e result return krse..
		System.out.println(el);

		// use of map()..
		System.out.println("\nuse of map()");
		List<Integer> li = List.of(5, 3, 5, 2, 4);
		List<Integer> num = li.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(num);
	}
}


/*
 * with help of stream we can perform operation on objects.. filter() na use thi
 * data filter kri skie nd collect() thi bdha filter thyela data collect thse nd
 * e bdha collect thyela data specified variable ma store kri skie..
 */