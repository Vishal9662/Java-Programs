package oops.polymorphism;

public class Static_Binding {

	private void m1() {
		System.out.println("This is private Method m1()");
	}
	
	public static void m2() {
		System.out.println("This is static Method m2()");
	}
	
	public static void main(String[] args) {
		Static_Binding s=new Static_Binding();
		s.m1();
		s.m2();	// static method we can also called by instance variable but it is not proper way for calling static method, it will give warning for it...
		Static_Binding.m2();
		
	}
}
