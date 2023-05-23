package oops;

public class FinalKeyword  {
	final int a=10;
	 void m1(){
//		a=5;
		System.out.println(a);
	}
	 
	 
	public static void main(String[] args) {
		FinalKeyword o=new FinalKeyword();
		o.m1();
	}
}



// final variable can not be changed, if we are trying to change the final var then compiler will give compile time error
// final method can not be overridden, if we are trying to change the final var then compiler will give compile time error
// final class can not be extend, if we are trying to change the final var then compiler will give compile time error