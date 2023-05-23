package nestedClasses;

public class Member_InnerClass {

	private int a=10;
	
	class Inner{
		void m1() {
			System.out.println("This is a Inner class method..");
			System.out.println("Outer class private variable is : "+a);
		}
	}	
	
		public static void main(String[] args) {
			Member_InnerClass obj=new Member_InnerClass();
			
			Member_InnerClass.Inner inobj=obj.new Inner();
			
			inobj.m1();
		}
}
