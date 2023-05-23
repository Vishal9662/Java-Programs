package logical;

import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		int i;
		
		System.out.println("Your number is: "+n);
		
		for(i=1;i<=n;i++) {
			n=n%10;
			System.out.println(i+" ");
		}
		
		System.out.println("The digits in Numbers are : "+i);
		
		
	}
}
