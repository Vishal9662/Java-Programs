package java_Annotation;

public class Anno_Override extends A {
	@Override
	 void m1() {
		System.out.println("In Sub");
	}
	
	public static void main(String[] args) {
		Anno_Override a=new Anno_Override();
		a.m1();
	}
}

class A{
	 void m1() {
		System.out.println("In Parent");
	}
}