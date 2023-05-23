package oops;

public class CovariantDemo extends CovB {
	public static void main(String[] args) {
		CovariantDemo cv=new  CovariantDemo();
		cv.d1();
		
		Cov cb=new Cov();
		cb.d1().m();
	}

}


class Cov{
	Cov d1() {
		System.out.println("In CLass CovA");
		return new Cov();
	}
	
	void m(){
		System.out.println("Method in Cov Class");
	}
}

class CovB extends Cov {
	@Override
	CovB d1() {

		System.out.println("In CLass CovB");
		return new CovB();
	}
}