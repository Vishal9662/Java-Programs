/*   
    * + + + + + * 
      * + + + *
        * + *
          *
*/

package logical;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n=sc.nextInt();
		
//		for(int i=n;i>=1;i--) {		// For rows
//			
//			for(int j=n-i;j>0;j--) {	//For Space
//				System.out.print("  ");
//			}
//			
//			for(int k=1;k<=i*2-1;k++) {	// For Printing
//				if(i==n || k==1 || k==i*2-1) {
////				if( k==1 || k==i*2-1 ) {		// For "V" pattern
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("+ ");
//				}
//			}
//			System.out.println();	//New line 
//		}
		
		
//	-------->  Another Method  <-------------
		int l=n+2;
		
		for (int i=0;i<n;i++){
			for (int j=0;j<i;j++) {
				System.out.print("  ");
			}

			for (int k=1;k<=l;k++) {
				if (k==1 || k==l || i==0 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("+ ");
				}
			}
			System.out.println("  ");
			l=l-2;
		}
	}
}


/*
	 * * * * * * * 
	   * + + + * 
	     * + * 
	       * 
  
 
*/