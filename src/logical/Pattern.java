package logical;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
			for(int j=i;j<=n;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}



/* For All Patterns
 * i1j1 i1j2 i1j3 i1j4 i1j5
 * i2j1 i2j2 i2j3 i2j4 i2j5
 * i3j1 i3j2 i3j3 i3j4 i3j5
 * i4j1 i4j2 i4j3 i4j4 i4j5
 * i5j1 i5j2 i5j3 i5j4 i5j5 
 *  */
 