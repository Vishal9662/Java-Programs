package java_Generics;

public class Object_typeLiterals {

	public static <Integer> Integer  m(Class<Integer> class1) throws InstantiationException, IllegalAccessException {
		System.out.println("new instance created..");
		return class1.newInstance();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		String s=m(String.class);
		System.out.println(s);
		
		Object_typeLiterals obj=m(Object_typeLiterals.class);
		System.out.println(obj);
	}
}

//for Class Object as a type literals..