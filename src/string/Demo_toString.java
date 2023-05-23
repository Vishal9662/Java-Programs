package string;

public class Demo_toString {
	
	int id;
	String name;
	
	public Demo_toString(int id,String name) {
		this.id=id;
		this.name=name;
	}

	// The toString() is method of Object Class, If you not override it then it will give fully qualified name with Hexa-decimal value..
	public String toString() {
		return id+" "+name;
	}
	
	public static void main(String[] args) {
		
		Demo_toString d=new Demo_toString(1, "Vishal");
		
		System.out.println(d);
		

	}

}
