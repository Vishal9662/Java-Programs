package exceptions;

public class MultiTryBlocks {
	public static void main(String[] args) {
		System.out.println("The All try Blocks are started from here....... \n");
		try {
			
			try {
				System.out.println("Inner try block of Arithmetic Exception");
				int b=5/0;
			}
			catch(ArithmeticException e){
				System.out.println("Here is the Arithmetic Exception Handled \n");
			}
			try {
				System.out.println("Inner try block of ArrayIndexOutOfBound Exception");
				int a[]=new int[5];
				 a[5]=3;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBound Exception Is Handled \n");
			}
		}
		catch(Exception e) {
			System.out.println("All Exception Handled\n");
		}
		
		System.out.println("Out of All try & catch blocks");
	}

}
