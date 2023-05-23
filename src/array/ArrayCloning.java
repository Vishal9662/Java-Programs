package array;

public class ArrayCloning {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("The Elements of 'A' Array: ");
		for(Object o:a) {
			System.out.print(o+" ");
		}
		
		System.out.println("\nAfter Cloning :-> The Elemets of 'B' Array: ");
		int b[]=a.clone();
		for(Object o1:b) {
			System.out.print(o1+" ");
		}
		
		System.out.println("\n\nNow Compare both Arrays. Is it Same :   ");
		System.out.println("By equals() Method :-> "+a.equals(b));
		System.out.print("By == Operator :--> ");
		System.out.print(a==b);
	}

}
