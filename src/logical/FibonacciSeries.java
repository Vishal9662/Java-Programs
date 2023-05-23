package logical;

public class FibonacciSeries {

	static int n1=0, n2=1, n3;
	
	private static void Fibo(int count) {
		if(count >= 0) {
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.println("\nn-One: "+n1);
			System.out.println("n-Two: "+n2);
			System.out.println("n-Three: "+n3);
			
			Fibo(count-1);
			
		}
	}
	
	public static void main(String[] args) {
	
		int count = 5;
		System.out.println(n1+" "+n2);
		Fibo(count-2);
		System.out.print("\n\n\nFinal is:-  "+n3);
	}



	
}
