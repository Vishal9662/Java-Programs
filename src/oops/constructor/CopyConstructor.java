package oops.constructor;


public class CopyConstructor {
	int a;
	String s;
	
	public CopyConstructor(int a1,String s1) {
		a=a1;
		s=s1;
	}


	public CopyConstructor(CopyConstructor c) {
		a=c.a;
		s=c.s;
	}

	void d1() {
		System.out.println(a+" "+s);
	}
	
	public static void main(String[] args) {
		
		CopyConstructor c=new CopyConstructor(1,"Vishal");
		CopyConstructor c1=new CopyConstructor(c);
//		c1.a=c.a;
//		c1.s=c.s;
		c.d1();
		c1.d1();
	}
}
