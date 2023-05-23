package oops;

public class Main_Aggregation {
	Aggregation a1;
	int id;
	String name;
	
	public Main_Aggregation(int id,String name,Aggregation a1) {
		this.id=id;
		this.a1=a1;
		this.name=name;
	}
	
	public void dis() {
		System.out.println(id+" "+name);
		System.out.println(a1);
	}
	
	
	public static void main(String[] args) {
		
		Aggregation ag=new Aggregation(2,"HFS");
		
		Main_Aggregation m=new Main_Aggregation(111,"Vishal",ag);
		
		m.dis();
	}
}