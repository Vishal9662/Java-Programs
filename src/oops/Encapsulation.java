package oops;

public class Encapsulation extends Enc {
	

	public static void main(String[] args) {
		
		Encapsulation e=new Encapsulation();
		System.out.println(e.getA());
		System.out.println(e.getName());
		
	}

}


class Enc{
	private int a=5;
	private String name="Vishal";
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}