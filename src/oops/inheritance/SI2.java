package oops.inheritance;

public class SI2 extends SI1 {
int a=12;

	@Override
	public void disp() {
		int a=10;
		System.out.println("This is overriden Method");
		System.out.println("Child Class Local Variable : "+a);
		System.out.println("In Child Class Method\n");
	}
	
	public static void main(String[] args) {
		SI1 p=new SI1();
		SI2 c=new SI2();
		SI1 u=new SI2();	//Upcasting
		SI2 d=(SI2)u;		//Downcasting
		p.disp();//calling method with help of parent class reference
		c.disp();//calling method with help of child class reference 
		u.disp();//calling method with help of upcasted reference
		d.disp();//calling method with help of downcasted reference

		System.out.println("In Main Method...");
		System.out.println("Child Class Global/Instance : "+c.a);
		System.out.println("Super Class Variable/Upcasated - Global : "+u.a);
		System.out.println("Downcasted Child Global Variable : "+d.a);
		
	}
}