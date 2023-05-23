package oops.inheritance;

import oops.Encapsulation;

public class SI1 extends Encapsulation {
	int a=10;
	public void disp() {
		System.out.println("Super Class Instance Variable : "+a);
		System.out.println("This Super Class method disp() is Called");
		
	}
	
	public void disp(String a) {
		System.out.println("This is Paramaterised Method...");
	}

	
	public static void main(String[] args) {
		SI1 s=new SI1();
		s.disp();
		s.disp("Vis");
		
		System.out.println(s.getName());
		
		Encapsulation e=new SI1();	// Upcasting
		System.out.println(e.getName());
		System.out.println(e.getA());
		
	}



}