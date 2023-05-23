package oops;

public class InstanceBlock {

	static{
		System.out.println("This is Static Block");
	}
	
	// Non - Static or Instance Block......
	{
		System.out.println("This is Instance Block.......");	// it's executing while every instance creation.
		//If we have same logic on every constructor then we can use this "Instance block"...
	}
	
	public InstanceBlock(String s) {
		System.out.println("This is String parameterised Constructor");
	}
	
	
	public InstanceBlock() {
		System.out.println("this is without parameter constructor");
	}


	public static void main(String[] args) {
		System.out.println("Main Method Started....");
		InstanceBlock i=new InstanceBlock();
		InstanceBlock i1=new InstanceBlock("str");
	}
}


