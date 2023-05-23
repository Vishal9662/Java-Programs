package exceptions;

import java.io.IOException;

public class ExcOverride extends Parent
{
	void m1() throws IOException {	
		System.out.println("Sub Classs");
	}
	public static void main(String[] args) {
		
		Parent p=new ExcOverride();
			try {
				p.m1();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}


class Parent {
	void m1() throws Exception
	{
		System.out.println("Parent Method");
	}
}

//If In parent class exception is not throwing then In sub class you can not throw checked Exception..
//and If you declare unchecked exception in parent class then you can not declare checked exception in child class...