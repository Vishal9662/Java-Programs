package threading.synchronisation;

public class Sync_Block {

	public static void main(String[] args) {
		A a=new A();
		
		MyThr t1=new MyThr(a);
		MyThr1 t2=new MyThr1(a);
		
		t1.start();
		t2.start();
	}

}

class A{
	void print(int n) {
		synchronized (this) {
			System.out.println("n:-> "+n);
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
			System.out.println("--------------");
		}
	}
	
}

class MyThr extends Thread {
	A a;
	
	MyThr(A a){
		this.a=a;
	}
	
	@Override
	public void run() {
		a.print(5);
	}
	
}


class MyThr1 extends Thread {
	A a;
	
	MyThr1(A a){
		this.a=a;
	}
	
	@Override
	public void run() {
		a.print(10);
	}
	
}