package logical;

public class Print {

//	public static void main(String[] args) {
//		int n=10;
//		
//		int a=cal(n);
//		System.out.println("\nSum is: "+a);
//	}
//
//	private static int cal(int n) {
//		
//		if(n==0) {
//			return 0;
//		}
//		
//		System.out.println(n);
//		
//		return cal(n+1);
//	}
	
	
	static int sum=0;
	public static void printDigits(int n, int i) {
		
		
		if(i<=n) {
			
			sum=sum+i;
			
			System.out.print(i+", ");
			i++;
			
			printDigits(n,i);
			
		}
	}

	
	public static void main(String[] args) {
		int n=10;
		int i=1;
		
		printDigits(n,i);
		System.out.println("\nThe sum is:->  "+sum);
	}
}
