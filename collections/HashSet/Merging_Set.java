package collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merging_Set {

	public static void main(String[] args) {
		
		Set<Integer> a=new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		
		Set<String> b=new HashSet<String>();
		b.addAll(Arrays.asList(new String[] {"HS","KH","DM","Vishal","Jaydip"}));
		
		System.out.println("Set of a:-> "+a);
		
		System.out.println("Set of b:-> "+b);
		
		//By addAll() Method.....
		Set<Object> mergeSet=new HashSet<Object>();
		
		mergeSet.addAll(a);
		mergeSet.addAll(b);
		
		System.out.println("Set of mergeSet by addAll():-> "+mergeSet);
		
		//By stream() Method.....
		Set<Object> merge=a.stream().collect(Collectors.toSet());
		
		merge.addAll(b);
		
		System.out.println("Set Of mergeSet By stream():-> "+merge);
		
		//By of() and addAll() Method...
		Set<Object> merge1=new HashSet<>();
		Stream.of(a,b).forEach(merge1::addAll);
		
		System.out.println("Set of mergeSet By of() and addAll():-> "+merge1);
		
				
	}
}
