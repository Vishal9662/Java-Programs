package java_Concurrency;

public class TestThread {

	public static void main(String[] args) {
		
		Helper r=new Helper("First-Thread");
		r.run();
	}
}


class Helper implements Runnable{
	String threadName;
	boolean suspended;
	
	public Helper(String name) {
		System.out.println("Creating:- "+name);
		
	}


	@Override
	public void run() {
		
		System.out.println("Running:- "+threadName);
		
		for(int i=1;i<=5;i++) {
			System.out.println("Thread:- "+threadName+", "+i);
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (this) {
			while(suspended) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Thread "+threadName+" is existing");		
	}
	
	
}