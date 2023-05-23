package java_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateFields {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Ex e=new Ex(1, "Vishal");
		
		//For accessing private fields 
		Field field=Ex.class.getDeclaredField("name");
		Field field2=Ex.class.getDeclaredField("id");
		
		field.setAccessible(true);
		field2.setAccessible(true);
		
		String nm=(String) field.get(e);
		int a=(int) field2.get(e);
		
		System.out.println("Private name is:-"+nm);
		System.out.println("Private Id is:- "+a);
		
		
		//For accessing private methods
		Method method=Ex.class.getDeclaredMethod("m1");
		method.setAccessible(true);
		method.invoke(e);
		
	}
}


class Ex{
	private int id;
	private String name;
	
	public Ex(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+", "+name;
	}
	
	
	private void m1() {
		System.out.println("Private Method accessed at outside class...");
	}
}