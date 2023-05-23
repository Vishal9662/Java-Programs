package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class DemoException {
	
	public static void main(String[] args) throws IOException {
		int i,j=1,k=0;
		
		Scanner sc=new Scanner(System.in);
		i=10;
		try {
			System.out.println("Enter Num : ");
			j=sc.nextInt();
			k=i/j;
			System.out.println("Output is : "+k);
			
		}
		catch(ArithmeticException e)	//for unchecked exception we have to throws it..
		{
			System.out.println("Arithmetic Exception --> "+e);
		}
		
		
		// Java is useful when we want to execute any important statement like closing statement..
		finally {
			System.out.println("I'm a Finally Block, I'm always been executed");
		}
	}

}
