// For invoking current class constructor...
// It will create chain between constructors

package oops.this_keyword;

public class Exc2 {

	public Exc2() {
		System.out.println("Inside default Constructor...");
	}
	
	public Exc2(int i) {
		this();		// It will maintain chain between constructors
		System.out.println("Inside Parameterised Construcotr...");
	}
	
	void m() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Exc2 ob=new Exc2(10);
		System.out.println("\nIt will prove that 'this' keyword pointing to instance variable : \n");
		ob.m();
		System.out.println(ob);

	}

}
