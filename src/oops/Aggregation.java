package oops;

public class Aggregation {
	int a;
	String s;
	
	public Aggregation(int a,String s) {
		this.a=a;
		this.s=s;
	}

	@Override
	public String toString() {
		return a+" "+s;
	}
	

}
