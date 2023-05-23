package oops.modifiers;

public class ProtectedClass {

	public static void main(String[] args) {
		Prt p=new Prt();
		p.msg();
	}
}




class Prt {
	protected void msg() {
		System.out.println("Message....");
	}
}






//"protected" data members are accessible outside package with help of IS-A relationship
