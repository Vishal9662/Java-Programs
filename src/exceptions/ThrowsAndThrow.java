// This example is for throws and throw keyword.

package exceptions;

import java.util.Scanner;

public class ThrowsAndThrow {
	
	// Demo for Use of throw keyword...
	// If you throw Checked Exception then throws declaration mandatory...
	public static void m1(int age) {
		if(age<18) {
			throw new ArithmeticException("Tu to Abhi Bachha hai, Not Eligible for DL");
		}
		else {
			System.out.println("Eligible for DL");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age :");
		int age=sc.nextInt();
		
			m1(age);
			
	}
}

////---> Demo for throw and throws keyword...
//
//public static void m() throws Exception  {
//	System.out.println("Error in m() Method");
//	throw new Exception();
//}
//
//public static void main(String[] args) { 
//	try {
//		m();
//	} catch (Exception e) {
//		System.out.println("Exception handled in main method");
//	}
//	
//	
//	// This is only for "throw" keyword
//	System.out.println("Enter Age : ");
//	Scanner sc=new Scanner(System.in);
//	int age=sc.nextInt();
//	if(age<18) {
//		throw new ArithmeticException("Tu to Abhi Bachha hai, Not Eligible for DL");
//	}
//	else {
//		System.out.println("Eligible for DL");
//	}
//
//}