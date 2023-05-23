package oops.polymorphism;

public class RuntimePoly {
	public static void main(String[] args) {
		P1 c=new C1();
		c.a1();
	}
}


class P1{
	void a1() {
		System.out.println("Inside Parent Class");
	}
}


class C1 extends P1{
	void a1() {
		System.out.println("Inside Child Class");
	}
}


// In this program the method binding by JVM so the binding is happening on run time, so it is example of Run time polymorphism....