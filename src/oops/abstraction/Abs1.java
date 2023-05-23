package oops.abstraction;

interface A{
	void stop();
}

public class Abs1 implements Abs,A {
	@Override
	public void start() {
		System.out.println("Start");
	}
	
	public static void main(String[] args) {
		Abs1 a=new Abs1();
		a.start();
		a.stop();
		
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

}
