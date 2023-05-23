package java_Annotations;

public class Anno_Deprecated {

	public static void main(String[] args) {
		AN a=new AN();
		a.n();
	}
}


class AN{
	void m() {
		System.out.println("In m");
	}
	
	@Deprecated
	void n() {
		System.out.println("In n");
	}
}


//This annotation marks that this method is deprecated, So compiler gives warning,
// It informs to user that not use such type of methods because this method will be removed in future..	