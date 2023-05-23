package oops;

public class CallByValue {
	
	 void m1(int a,int b) {
		int c=a+b;
		
		a=b;
		System.out.println("After swapping of A : "+a);
		
		System.out.println("Inside : "+c);
	}

	public static void main(String[] args) {
		
		int a=10;
		int b=5;

		CallByValue o=new CallByValue();
		System.out.println("Before "+a);
				
		o.m1(10,5);
		
		System.out.println("After "+b);
	
	}

}


// If we call a method passing a value, it is known as call by value