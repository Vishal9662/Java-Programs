package nestedClasses;

public class Static_NestedClass {

	static int a=10;
	
	static class Inner{
		
		static void m1() {
			System.out.println("Inside Inner");
			System.out.println("The Value of outer static variable is : "+a);
		}
	}
	
	public static void main(String[] args) {
//		Static_NestedClass.Inner obj1=new Static_NestedClass.Inner();
//		obj1.m1();
		
		Static_NestedClass.Inner.m1(); //If the method is static in static class, so there is no need to create instance of class..
	}
}
