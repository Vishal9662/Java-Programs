package java_Generics;

public class Generic_Class {

	public static void main(String[] args) {
		Helper<Integer> h=new Helper<>();	//Class type generic...
		
		h.insert(54);
		
		System.out.println(h.get());
	}
}


class Helper<T>{
	T str;
	
	public void insert(T str) {
		this.str=str;
	}
	
	T get() {
		return str;
	}
}