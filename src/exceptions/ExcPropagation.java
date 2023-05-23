package exceptions;

import java.io.IOException;

public class ExcPropagation {

	void a() throws IOException {	//Using throws keyword we can declare and propagate checked exception.. 
//		int n=50/0;
		throw new IOException("Exception");	//Using only throw keyword we can not declare and propagate checked exception..
	}
	
	 void b() throws IOException {
		a();
	}
	
	 void c() {
		try {
			b();
		}
		catch(Exception e){
			System.out.println("Exception of A() is handled in C() Method");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The Example of Exception Propogation \n");
		System.out.println("The Main Method Started from Here \n");
		ExcPropagation obj=new ExcPropagation();
		obj.c();
		
	}

}


//	We are allowed to throw only one exception at a time,  we cannot throw multiple exceptions.
//	We can declare multiple exceptions using throws keyword that can be thrown by the method. For ex, main() throws IOException, SQLException.