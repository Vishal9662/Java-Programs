package oops;

public class MethodOverloading {
	public void m1(){
		System.out.println("Method 1");
	}
	
	public void m1(String str) {
		System.out.println("Method 1 Overloaded with String Argument");
	}
	
	public void m1(int n) {
		System.out.println("Method 1 Overloaded with Integer Argument");
	}
	

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		
		obj.m1();
		obj.m1("Hyy");
		obj.m1(10);
		
	}
}
