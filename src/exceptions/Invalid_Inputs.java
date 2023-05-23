package exceptions;

import java.util.Scanner;

public class Invalid_Inputs {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number within 100 : ");
		int n=sc.nextInt();
		
		try {
			if(n<100) {
				System.out.println("OK...");
			}
			else {
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("Not a valid number, Please enter valid number "+e);
		}
	}

}
