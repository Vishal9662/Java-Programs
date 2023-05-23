package java_Reflection;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GettersAndSetters {
	
	public void invokeSetter(Object obj, String varName, Object varValue) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, 
																					InvocationTargetException 
	{
		PropertyDescriptor pd = new PropertyDescriptor(varName, obj.getClass());	
		
		Method setter = pd.getWriteMethod();
		
		setter.invoke(obj, varValue);
		 
		
	}

	public void invokeGetter(Object obj, String varName) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		PropertyDescriptor pd=new PropertyDescriptor(varName, obj.getClass());	//inbuilt class 
		
		Method getter=pd.getReadMethod();
		
		Object f= getter.invoke(obj);
		System.out.println(f);
	}
	
	
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IntrospectionException {
		GettersAndSetters gs=new GettersAndSetters();
		
		User user=new User();
		
		gs.invokeSetter(user, "id", 1);
		gs.invokeSetter(user, "name", "Vishal");
		
		gs.invokeGetter(user, "id");
		gs.invokeGetter(user, "name");
		
		
	}
}


class User{
	private int id;
	private String name;
	
	public User() {

	}
	
	
	//Getters & Setters Methods...
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
	
	
}