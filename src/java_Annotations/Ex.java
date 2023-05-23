package java_Annotations;

@OwnAnnotation 
public class Ex {



	@OwnAnnotation
	public Ex() {
	}
	
	@OwnAnnotation
	void m1() {
		
	}
	@OwnAnnotation
	public static void main(String[] args) {
		
		@Single_Value_Annotation(value = 45)
		int a;
		
	}
}

/*
	Purpose of Java Annotation:-
-> For give to some instructions to the compiler..
-> And also for giving Run-time Instructions

Normally, Java annotations are not present in your Java code after compilation,
It is possible, however, to define your own annotations that are available at runtime. These annotations can then be accessed via Java Reflection..


We can place annotation above Classes, Interfaces, methods, method parameters, fields and local variables..

--> Some Built-in Annotations:-
-> @Override :- When we want to override super class method in sub class then we should use it to inform to compiler that we are overriding a method,
				So when superclass method is removed or changed, compiler will show error message.
				
-> @SuppressWarnings :- This is just to tell compiler to ignore specific warnings they produce, 
						ex, using raw types in java generics. It’s retention policy is SOURCE and it gets discarded by compiler.

-> @Deprecated :- It marks that this method is deprecated so compiler prints warning,
 				  It informs user that it may be removed in the future versions. So, it is better not to use such methods..


--> Other Built-in Java Annotations used for build custom Annotations:-
This all describes in OwnAnnotation File...
-> @Target :-
-> @Documented :-
-> @Inherited :-
-> @Retention :-
-> @Repeatable :-
*/