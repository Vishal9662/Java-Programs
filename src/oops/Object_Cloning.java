package oops;

public class Object_Cloning implements Cloneable {

	int i;
	String str;
	
	public Object_Cloning(int i, String str) {
		this.i=i;
		this.str=str;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) {
		Object_Cloning c1=new Object_Cloning(1,"Vishal");
		
		try {
			Object_Cloning c2=(Object_Cloning) c1.clone();		// Here we created the copy of object using downcasting.. 
			
			Object_Cloning c3=(Object_Cloning) c2.clone();		// Here we created the copy of object using downcasting.. 
			
			System.out.println(c1.i+" "+c1.str);
			
			System.out.println(c2.i+" "+c2.str);
			
			System.out.println(c3.i+" "+c3.str);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



//--> Object Cloning means creates a copy of object