// For refer current class instance variables

package oops.this_keyword;

public class UsingThis {
	int i;
	String s;
	
	// with this keyword and variables are same, so this will refer the class instance variable 
	public UsingThis(int i,String s) {
		this.i=i;
		this.s=s;
	}
	
	
	//without this keyword but the variables are different.
//	public UsingThis(int in,String st) {
//		i=in;
//		s=st;
//	}
	
	void d1() {
		System.out.println(i+" "+s);
//		System.out.println(this);  	//  It will gives fully qualified name with hexadecimal value, it is same as object address
	}

	public static void main(String[] args) {
		UsingThis obj=new UsingThis(111,"Vishal");
		UsingThis obj1=new UsingThis(222, "Jaydip");
		
		obj.d1();
		obj1.d1();
	}

}