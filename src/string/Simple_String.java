package string;

public class Simple_String {

	public static void main(String[] args) {
		
		A a=new A(1,"Vish");
		System.out.println(a);	// This example by overriding toString().
		
		String s1="String1";
		String s2=new String("String2");
		
		String s3="String1";	// It will not create new instance.
		String s4=new String("String2");	// It will create new instance.
		
		char c[]= {'A','B','C','D','E'};
		String s5=new String(c);
		System.out.println(s5);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}

// For understanding importance of toString(). 

class A{

	 String str;
	 int i;

	public A(int i, String str) {
		this.i=i;
		this.str=str;
	}

	@Override
	public String toString() {
		return str +" "+  i ;
	}
	
	
	
}