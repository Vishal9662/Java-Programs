package updates;

public class Demo_Const_References {

	public static void main(String[] args) {
		Ai a = Ac::new;

		a.m1();
	}

}

class Ac {
	public Ac() {
		System.out.println("I'm constructor of Ac Class..");
	}
}

interface Ai {
	Ac m1();
}