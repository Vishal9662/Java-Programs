package updates;
public class Demo_Lambda  {
	
	public static void main(String[] args) {
	
		A obj = (int i, String name) -> {
			System.out.println("In Method.. "+i+"\nHyy "+name);	//By using Lambda Expression
		};
	
//		A obj1 = (a, b) -> 
//		{
//			return a+b;
//		};
		
		//If you have only 1 stmt nd that is return stmt then no need to write return keyword, simply remove curly brackets and return a value..
	
		
		/*	Simple declaration of declare method
		 A obj = new A()
		 {	
		 	void m1(){
		 			  	System.out.println("Method");
		 			 }
		 }
		 
		 */
				
				
		obj.m1(5,"Vishal");
		
//		int result = obj1.m2(5,5);
		
//		System.out.println("The result is: "+result);
	}

}



//If we want only 1 abstract method in interface then use @FunctionalInterface Annotation above interface
//@FunctionalInterface
interface A{
	
	void m1(int i, String name);

//	int m2(int a, int b);
	
}