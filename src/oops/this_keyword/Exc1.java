// For invoking current class method

package oops.this_keyword;

public class Exc1 {

	public static void main(String[] args) {
		A a=new A();
		System.out.println("Calling Only n1() Method : ");
		a.n1();
		
		System.out.println("Calling Only m1() Method : ");
		a.m1();
	}

}


class A{
	void m1() {
		System.out.println("Inside m1() Method");
	}
	
	void n1() {
		this.m1();
		System.out.println("Inside n1() Method");
		
	}
}