package oops;

public class Strictfp_EXC {
	
	 double a() {
		double f1=11.36;
		double f2=2.32;
		return f1-f2;
	}

	public static void main(String[] args) {
		Strictfp_EXC s=new Strictfp_EXC();
		System.out.println(s.a());
	}
}
