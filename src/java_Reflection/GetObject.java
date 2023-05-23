package java_Reflection;

class A{}
public class GetObject {

	public static void main(String[] args) throws Exception {
		Class<?> c=Class.forName("java_Reflection.GetObject");
		
		System.out.println("Instance created by forName():- "+c.getName());	//By forName()...
		
		A a=new A();
		
		
		Class<? extends A> c1=a.getClass();
		
		System.out.println("Instance created by getClass():- "+c1);	
		
		Class<String> c2=String.class;
		System.out.println("Instance created by .class extension:- "+c2.getName());
		
		Class<GetObject> c3=GetObject.class;
		System.out.println("Instance created by .class extension:- "+c3.getName());
		
	}
}

