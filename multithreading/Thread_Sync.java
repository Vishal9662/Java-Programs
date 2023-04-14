package multithreading;

public class Thread_Sync {
	public static void main(String[] args) {
		Table tab=new Table();
		
		Thread1 t1=new Thread1(tab);
		Thread2 t2=new Thread2(tab);
		
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		
		t1.start();
		t2.start();
	}
}

class Table{
	public synchronized void print(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" -> "+i);
		}
	}
}

class Thread1 extends Thread{
	Table t;
	
	public Thread1(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.print(5); 
	}
}

class Thread2 extends Thread{
Table t;
	
	public Thread2(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.print(5); 
	}
	
}