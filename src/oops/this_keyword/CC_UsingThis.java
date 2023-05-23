package oops.this_keyword;

public class CC_UsingThis {

	int id;
	String str;
	double sal;
	
public CC_UsingThis(int id, String str) {
		this.id=id;
		this.str=str;
		
	}
	
	public CC_UsingThis(int id, String str, double sal) {
		this(id,str); // It will create chain between constructor, If you want to perform between two class then use super() instead of this()....
		this.sal=sal;
		
	}
	
	void d1() {
		System.out.println(id+" "+str+" "+sal);
	}

	public static void main(String[] args) {
		
		CC_UsingThis c=new CC_UsingThis(1,"vish",25000);
		c.d1();

	}

}
