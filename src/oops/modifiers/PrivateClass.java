package oops.modifiers;

public class PrivateClass {
	public static void main(String[] args) {
		Pvt p=new Pvt();
//		p.msg();   // It gives compile time error because we can not access private members outside the class
	}
}



class Pvt{
	private int a=15;
	private void msg() {
		System.out.println("Message....");
	}
}




// "private" data members are not accessible outside the class
// "default" data members are not accessible outside the package
// "protected" data members are accessible outside package with help of IS-A relationship
// "public" data members are accessible anywhere outside class and outside package also