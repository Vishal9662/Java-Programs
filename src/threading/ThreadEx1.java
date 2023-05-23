package threading;

public class ThreadEx1 implements Runnable {
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" -> "+i);
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadEx1 obj=new ThreadEx1();
		
		Thread t=new Thread(obj);
		Thread t1=new Thread(obj);
		
		t.setName("Aapdo Thread-1");	//Used for set the name of Thread..
		t1.setName("Aapdo Thread-2");	//Instead of this you can give directly to constructor of thread while creating object of it..
		
		t.start();
		t1.start();
	}

	

}
