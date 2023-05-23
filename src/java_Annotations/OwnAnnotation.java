package java_Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface OwnAnnotation {}


	
	/**Marker Annotation*/
	@interface Marker_Annotation{}

	
	
	/** Single Value Annotation */
	@interface Single_Value_Annotation{
		int value();
	}
	
	
	
	/** Multi-Value Annotation */
	@interface Multi_Value_Annotation{
		int value1()
			default 1;
		
		String m()
			default "";
		
		String m1()
			default "Vishal";
		
	}



/*
 we can create custom or user defined annotation with @interface element 
 
 Type of Annotation:-> 
--> Marker Annotation: If annotation don't have any method that is known as Marker Annotation.

--> Single Value Annotation: If annotation has only single method that is known as Single Value Annotation

--> Multi-Value Annotation: If annotation has multiple method that is known as Multi-Value Annotation..


--> @Target
->  If you want specify type of annotation and if you want restrict the annotation then use @Target annotation..
->  It has type such as TYPE, PARAMETER, CONSTRUCTOR, FIELD, METHOD, LOCAL_VARIABLE, ANNOTATION_TYPE


--> @Retention
->  It is used for specify to what level annotation will be available

->  RetentionPolicy.SOURCE  - refers to the source code, discarded during compilation. It will not be available in the compiled class.
->	RetentionPolicy.CLASS	- refers to the .class file, available to java compiler but not to JVM . It is included in the class file.
->	RetentionPolicy.RUNTIME	- refers to the runtime, available to java compiler and JVM .


--> @Inherited
-> By default, Annotations are not inherited to sub classes, This annotation marks the annotation to be inherited to subclasses.
-> Aa annotation use kri ne j class create kryo hoy, psi e class ne kyak inherit kro to aa class ni value sub class ne aapvi mandatory bne

--> @Documentd
-> If you want to create documentation of that annotation after builded application then you should use this annotation..
*/