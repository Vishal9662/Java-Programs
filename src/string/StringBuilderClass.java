package string;

public class StringBuilderClass {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Vishal");
		System.out.println(sb.capacity());	// It will returns the current capacity of Class, It depends on value which is inserted, the by default size is 16..
		sb.append(" Gohil");	// concat the given string..
		System.out.println(sb);
		
		sb.insert(6, " Bhai");	// Insert the string from specified position..
		System.out.println(sb);
		
		sb.replace(7, 11, "Hirabhai");	//replace string , starting index, last index,(from where to where you want to cut the string)..
		System.out.println(sb);
		
		sb.delete(6, 15);	//delete a string from specified position, starting index is exclusive --> means it will not count & ending index is inclusive-> means it will count..
		System.out.println(sb);
		
		sb.reverse();	// It can reverse a whole string..
		System.out.println(sb);
	}

}


/* The main diffrence between of Buffer and Builder Class is 
 * The StringBuffer class is thread-safe and synchronized, It means multiple threads can not call the methods of StringBuffer simultaneously..
 * The StringBuilder class is not thread-safe and non-synchronized, It means multiple threads can call the methods of StringBuilder simultaneously..
*/