package array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int[] b=new int[a.length];

		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
		System.out.println("The Elemets of 1st Array: ");
		for(int i=1;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nThe Elemets of 2nd Array: ");
		for(int i=1;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
