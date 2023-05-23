package oops;

public class Recursion {
	
//	static int n=0;
//	static void m() {
//		n++;
//		if(n<=5) {
//		System.out.println("Called..");
//		m();
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		m();
//	}
	
//	---------------------------- Factorial using Recursion ----------------------------
	
	static int fact(int no) {
		if(no==1) {
			return 1;
		}
		else{
			return (no*fact(no-1));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Factorial is : "+fact(5));
	}
     
}
