package oops.abstraction;

public class Abstraction1 extends Abstraction {

	public static void main(String[] args) {
		Abstraction1 a=new Abstraction1();	//Upcasting
		a.start();
		a.stop();
	}
	 
	
	void start(){
		System.out.println("Started...");
	}


	@Override
	void stop() {
		System.out.println("Stop");
	}

}
