package updates;

public class Functional_Interface implements A_Interface {

	public static void main(String[] args) {
		Functional_Interface obj=new Functional_Interface();
		
		obj.disp();
	}

	@Override
	public void disp() {
		System.out.println("Hello...");
	}
}

@FunctionalInterface
interface A_Interface{
	void disp();
	
}


/*
Je interface ni upar @Functionalnterface no use krie psi ema only 1 j abstract method no use kri skie..
An Interface that contains exactly one abstract method is known as functional interface.
It can also declare methods of object class.
*/