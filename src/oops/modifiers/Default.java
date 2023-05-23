package oops.modifiers;

public class Default {
	public static void main(String[] args) {
		Dft d=new Dft();
		d.msg();
	}
	

}



class Dft{
	void msg() {
		System.out.println("Message....");
	}
}







//"default" data members are not accessible outside the package
