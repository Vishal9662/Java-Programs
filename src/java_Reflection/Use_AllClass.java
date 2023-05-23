package java_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Use_AllClass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, 
													IllegalAccessException, IllegalArgumentException, 
													InvocationTargetException, NoSuchFieldException {
		Helper obj=new Helper();
		
		Class<? extends Helper> cls=obj.getClass();
		System.out.println("Class Name is:- "+cls.getName());
		
		
		Constructor<? extends Helper> cns=cls.getConstructor();
		System.out.println("\nThe Constructor Name is:- "+cns.getName());
		
		System.out.println("\nThe Methods of Class class:- ");
		Method[] method=cls.getMethods();
		for(Method m:method) {
			System.out.print(m.getName()+",  ");
			
		}
		
		
		Method mCall1=cls.getDeclaredMethod("method2", int.class);
		System.out.println("\n");
		mCall1.invoke(obj, 20);
	
		System.out.println("\nBefore set it at run time using Field Class");
		Method mCall=cls.getDeclaredMethod("method1");
		mCall.invoke(obj);
				
		
		Field field=cls.getDeclaredField("s");
		
		field.setAccessible(true);	//If I give false here then I can not set it like below, or else it will throw exception
		
		field.set(obj, "I'm from Run-time");
		
		
		System.out.println("\nAfter set it at run time using Field Class");
		Method mCall2=cls.getDeclaredMethod("method1");
		mCall2.invoke(obj);

		
		System.out.print("\nAccessing the private method from another class....\n");
		Method mCall3=cls.getDeclaredMethod("method3");
		mCall3.setAccessible(true);
		mCall3.invoke(obj);
		
		
		
	}
}


class Helper{
	private String s;
	
	public Helper() {
		s="Vishal Gohil";
	}
	
	public void method1() {
		System.out.println("The string is:- "+s);
	}
	
	public void method2(int n) {
		System.out.println("The number is:- "+n);
	}
	
	private void method3() {
		System.out.println("Hooore, Private method is invoked at outside class...");
	}
	
}