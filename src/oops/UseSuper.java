package oops;

public class UseSuper {

	public static void main(String[] args) {
		Child c=new Child();
	}
}

class Parent{
	int a=10;
	
	Parent(){
		System.out.println("Parent Constructor called");
	}
	
	void p1(){
		System.out.println("Parent method is called");
	}
}


class Child extends Parent{
	
	Child(){
		super();		//calling parent class constructor 
		super.p1();		//calling parent class method

		System.out.println("This is Parent class variable:-> "+super.a);
		System.out.println("Child Constructor called");
	}
}