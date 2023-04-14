package multithreading;

public class Sync_Block {

	public static void main(String[] args) {
		A a=new A();
		
		Thr1 t1=new Thr1(a, "Vishal");
		Thr2 t2=new Thr2(a, "Jaydip");
		
		t1.start();
		t2.start();
	}

}


class A{
	void m1() {
		//Some Codes
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" - "+i);
			}
		}
		
		//Some Codes
	}
}

class Thr1 extends Thread{
	A a;
	String str;
	public Thr1(A a,String str) {
		this.a=a;
		this.str=str;
	}
	
	@Override
	public void run() {
		a.m1();
	}
}

class Thr2 extends Thread{
	A a;
	String str;
	public Thr2(A a,String str) {
		this.a=a;
		this.str=str;
	}
	
	@Override
	public void run() {
		a.m1();
	}
}