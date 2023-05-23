package nestedClasses;

interface Outer{
	void m1();
	
	interface Inner{
		void m2();

	}
	
}


public class Nested_Interface implements Outer.Inner,Outer {
	
	@Override
	public void m2() {
		System.out.println("Method of Inner Interface..");
	}
	
	@Override
	public void m1() {
		System.out.println("Method of Outer Interface..");
	}

	
	public static void main(String[] args) {
		Outer.Inner obj=new Nested_Interface();
		obj.m2();
		
		Outer o=new Nested_Interface();	// For access the method of outer interface..
		o.m1();
	}


	
}


