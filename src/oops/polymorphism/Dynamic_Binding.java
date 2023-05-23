package oops.polymorphism;

public class Dynamic_Binding extends Ex {

	@Override
	void d1() {
			System.out.println("In Child Class");
	}
	
	public static void main(String[] args) {
		Dynamic_Binding d=new Dynamic_Binding();
		d.d1();
		
	}
}


class Ex{
	void d1() {
		System.out.println("In Parent Class");
	}
}