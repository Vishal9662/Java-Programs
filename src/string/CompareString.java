package string;


public class CompareString {

	public static void main(String[] args) {
		
		String s1="String1";
		String s2="String1";
		String s3=new String("String1");
		String s4="vishal";
		String s5=s3.intern();	//It will create a exact copy of string object and store it in String constant pool.
		
		//------------- Compare by equals() method ----------------------------
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));	//this method ignore case, it is not sensitive method
		System.out.println();
		
		
		//----------- Compare by == operator ----------------
		System.out.println(s1 == s2);	// true bcz it both stored in constant pool so both reference point to same object
		System.out.println(s1 == s3);	//false bcz it both stored in non constant pool so it refers different object
		System.out.println(s1==s5); 	//true bcz due to intern method.  
		System.out.println();
		
		//-----------Compare by compareTo() ------------------
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));
		
		
	}
}
