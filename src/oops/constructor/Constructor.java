package oops.constructor;

public class Constructor {

	
	public Constructor() {
		this("Hyy");	//Constructor Chaining achieve here.
		System.out.println("Simple Constructor is called");
	}
	
	
	public Constructor(String str) {
		System.out.println("Paramaterised Constructor is called with String Argument");
	}

	
	public static void main(String[] args) {
		
		Constructor obj=new Constructor();
	}

}

