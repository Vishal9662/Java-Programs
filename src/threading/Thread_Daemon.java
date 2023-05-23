package threading;

public class Thread_Daemon extends Thread {
	
	@Override
	public void run() {
			
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread is working..");
		}
		else {
				System.out.println("User Created Thread..");
		}
	}
	

	public static void main(String[] args) {
		
		Thread_Daemon t1=new Thread_Daemon();
		Thread_Daemon t2=new Thread_Daemon();

		t1.setDaemon(true);	//If thread is started then it will throw exception, so if we want to make it daemon thread then set it before starting thread..
		
		t1.start();
		t2.start();
	}
}
