package java_Generics;

public class Generic_Method {

	//generic type method..
	
	static <T> void dip(T t) {
		System.out.println(t+", -> "+t.getClass());
	
	}
	
	public static void main(String[] args) {
		dip(65);
		
		dip("Vishal");
		
		dip(543.234);
	}
}
