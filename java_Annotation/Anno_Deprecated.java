package java_Annotation;

public class Anno_Deprecated {

	public static void main(String[] args) {
		Anno a=new Anno();
		
		a.n();

	}

}

class Anno{
	void m() {
		System.out.println("In m");
	}
	
	@Deprecated
	void n() {
		System.out.println("In n");
	}
}


/*
@Deprecated annotation marks that this method is deprecated so compiler prints warning. 
It informs user that it may be removed in the future versions. So, it is better not to use such as methods.

At Compile Time:
Note: Test.java uses or overrides a deprecated API.

Note: Recompile with -Xlint:deprecation for details.
*/