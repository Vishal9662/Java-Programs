package logical;

public class SortArray {

	public static void main(String[] args) {
		
		int a[]= {5,7,8,3,6,4,2};
		
		int b[]= new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				 
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			b[i]=a[i];
			
			System.out.println(b[i]);
		}
		
	}
}
