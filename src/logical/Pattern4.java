/*
  
			*   
			* *   
			* * *   
			* * * *   
			* * * * *   
			* * * *   
			* * *   
			* *   
			* 
   
*/


package logical;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=(n*2)-1;i++) {
			for(int j=1;j<=i;j++) {
				if(i==n || j==1 || i==1 || i<=n) {
				System.out.print("* ");
				}	
			}
			
			for(int k=n;k<n;k--) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
		
		
//        for (int i=0;i<=n-1;i++)
//        {
//            for (int j=0;j<=i;j++) {
//            	System.out.print("* "); 
//            }
//         System.out.println("  "); 
//        }
//        for (int k=n-1;k>=0;k--)
//        {
//            for(int l=0;l<=k-1;l++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println("  ");
//        }
    
		

		
		
//		int a=1;
//		for(int k=1;k<=n*2-1;k++) {
//			for(int j=1;j<=a;j++) {
//				System.out.print("* ");
//			}
//			if(k<=n/2) {
//				a++;
//			}else {
//				a--;
//			}
//			System.out.println();
//		}
		
		
	}

}
