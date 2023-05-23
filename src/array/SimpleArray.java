package array;

public class SimpleArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		System.out.println("The length of Array : "+a.length);
		System.out.println("\nTraversing Using For Loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("\nTraversing Using ForEach Loop");
		for(int j:a) {
			System.out.println(j);
		}
	}

}