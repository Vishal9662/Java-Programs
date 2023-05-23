package nestedClasses;

public class Anony_InnerClass {

	public static void main(String[] args) {
		Person p=new Person() {
			
			@Override
			void m1() {
				System.out.println("m1() method in new Constructor...");
			}
			
		};
		
		p.m1();
	}

}



//With abstract class

abstract class Person{
	 abstract void m1();
}

// With Concrete class

//class Person{
//	 void m1() {
//		 System.out.println("In Class");
//	 }
//}


//// With Interface
//interface Person{
//	void m1();
//}