package nestedClasses;

public class Local_InnerClass {
	private int a=10;
	
	void d1() {
		
		class Inner{
			int b=15;
			void m1() {
				int c=a+b;
				System.out.println(c);
			}
		}
		
		Inner in=new Inner();
		in.m1();
	}
	
	public static void main(String[] args) {
		Local_InnerClass ln=new Local_InnerClass();
		ln.d1();
	}

}
