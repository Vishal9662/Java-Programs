package oops;

public class StaticBlock {
	static int a=10;
	int b=5;
	
	//Static Block
	static {
		System.out.println("Static Block");
	}
	
	//Non Static Block
	{
		System.out.println("Non Static Block");
	}
	
	static void m1() {
		System.out.println("Static Method..");
	}
	
	void m2() {
		System.out.println("Non Static Method..");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		StaticBlock s=new StaticBlock();

		System.out.println("Static Instance Variable Called -> "+StaticBlock.a);
		System.out.println("Non static Instance Variable called -> "+s.b);  //For	
		
		StaticBlock.m1();
		s.m1();  // static method we can also called by instance variable but it is not proper way for calling static method, it will give warning for it...
		s.m2();
		
	}
}
