package java_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface MyAnnotation {
	
/** It is single value Annotation... */
//	int value() 
//		default 0;
	
	
/** Multi-Value Annotation... */
	int value1()
		default 5;	
	
	String value2()
		default "";
	
	String value3()
		default "Vishal";
	
	
}


/*
If annotation don't have any method then it is called as Marker Annotation..

If it has any values means data members then it is called Single Value Annotation..

If it has multiple values then it is called as Multi-Value Annotation..

--> Some built-in Annotations used for build custom Annotations 
@Target -> It is used to specify at which type, annotation is used..

Element Types  	-	Where the annotation can be applied

TYPE		  	-	class, interface or enumeration
FIELD		   	-	fields
METHOD		   	-	methods
CONSTRUCTOR	   	-	constructors
LOCAL_VARIABLE 	-	local variables
ANNOTATION_TYPE -	annotation type
PARAMETER		-	parameter

@Retention -> It is used to specify to what level annotation will be available.

RetentionPolicy			-	Availability
RetentionPolicy.SOURCE	-   refers to the source code, discarded during compilation. It will not be available in the compiled class.
RetentionPolicy.CLASS	-	refers to the .class file, available to java compiler but not to JVM . It is included in the class file.
RetentionPolicy.RUNTIME	-	refers to the runtime, available to java compiler and JVM .

*/