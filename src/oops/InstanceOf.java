package oops;

public class InstanceOf extends Parent1 {
	
	
	// Downcasting with instanceof operator
	
	public static void m1(Parent1 ins1) {
		if(ins1 instanceof InstanceOf) {
			InstanceOf ins=(InstanceOf) ins1;	//Here Downcasting is performing...
			System.out.println("Downcasting is performed");
		}
	}
	
	public static void main(String[] args) {
		InstanceOf in=new InstanceOf();
		System.out.print("Your 'in' instance is instance of InstanceOf Class : ");
		System.out.println(in instanceof InstanceOf);
		
		System.out.print("Your 'in' instance is instance of Parent Class : ");
		System.out.println(in instanceof Parent1);
		
		Parent1 i=null;		// If instance is null then if we compare it with instanceof keyword, it will give false, bcz there is no any value in instance
		System.out.println(i instanceof Parent1);
		
		Parent1 ins1=new InstanceOf();
		InstanceOf.m1(ins1);
		
	}

}


class Parent1{	
}