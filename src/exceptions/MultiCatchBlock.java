package exceptions;

public class MultiCatchBlock {

	public static void main(String[] args) {

		try {
	
			int a[]=new int[5];
			System.out.println(a[10]);
			
			int ab=5/0;	//For Arithmetic Exception
			
			String s=null;
			System.out.println(s.length());
		}
		
		catch(ArithmeticException e){
			System.out.println("Here Arithmetic Exception Handled...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Here ArrayIndexOutOfBounds Exception Handled");
		}
		
		// You are not able to add this catch block to top because we should maintain order of exception,
		// If you place this exception at top then compile time error will come
		// If you remove all other exception and only place this exception then all exceptions are handled bcz it is parent of all exception..
		catch(Exception e) {
			System.out.println("Parent Exception Handled");
		}

	}

}
