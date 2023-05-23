package logical;

public class Pattern5 {

	public static void main(String[] args) {
		int n=5;
		
		int a=1;
		int b=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");             
			}
			
			for(int k=n;k>=i;k--) {
				if(i%2==0) {
					System.out.print(a+" ");
					a++;
				}
				else {
					System.out.print(b+" ");
					b++;
				}
			}   
			System.out.println();
		}
	}

}