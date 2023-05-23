// For pass this keyword as method argument and invoking that method

package oops.this_keyword;

public class Exc3 {
	
	void a(Exc3 obj) {
		System.out.println("This is A Method..");
	}
	
	void b() {
		a(this);
	}

	public static void main(String[] args) {
		Exc3 e=new Exc3();
		e.b();
		e.a(e);
	}

}
