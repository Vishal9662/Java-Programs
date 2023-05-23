package oops.abstraction;

public class Interface_Ex implements A_Interface {
	
	@Override
	public void a() {
		System.out.println("This is Simple A method from Interface...");
	}
	
	
	public static void main(String[] args) {
		Interface_Ex obj=new Interface_Ex();
		
		obj.a();
		
		obj.msg();
		
		A_Interface.m2();
	}
}


interface A_Interface{
	default void msg() {
		System.out.println("Inside default Method...");
	}
	
	void a();
	
	static void m2() {
		System.out.println("Inside static Method...");
	}	
}