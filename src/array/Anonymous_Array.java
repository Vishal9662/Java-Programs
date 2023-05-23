package array;

public class Anonymous_Array {

	public void m1(int a[]) {
		System.out.println("Printing the elements from Anonymous Array");
		for(Object o:a) {
			System.out.println(o);
		}
	}
	
	public static int[] method() {
			return new int[]{5,6,8,2,7,5};
	}
	 
	public static void main(String[] args) {
		
		Anonymous_Array obj=new Anonymous_Array();

		//		int a[]=new int[{4,5,6,7,2}];	// this is simple declaration array
		obj.m1(new int[] {5,6,7,9,8});	//this is Anonymous Array....
		
		System.out.println("----------------------------------------------------------------------");
		int arr[]=method();
		System.out.println("\nPrinting the elements from method");
		for(Object o:arr) {
			System.out.println(o);
		}
		
	}
}
