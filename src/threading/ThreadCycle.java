package threading;

public class ThreadCycle implements Runnable {

	public static  Thread t1;
	public static ThreadCycle obj;
	
	public static void main(String[] args) {
		obj=new ThreadCycle();
		
		t1=new Thread(obj);
		
		System.out.println("1 >>> The Name Of 1st Thread : -> "+t1.getName());
		
		System.out.println("2 >>> The State of Thread t1 after creating -->  "+t1.getState());
		
		t1.start();
		
		System.out.println("3 >> No Decision >>> The State of Thread t1 after invoking start() -->  "+t1.getState());
	}

	@Override
	public void run() {
		ExClass ex=new ExClass();
		Thread t2=new Thread(ex);
		
		System.out.println("3 >>> The Name Of 2nd Thread : -> "+t2.getName());
		
		System.out.println("4 >>> The state of Thread t2 after creating -->  "+t2.getState());
		
		t2.start();
		
		System.out.println("5 >> The State of Thread t2 after invoking start() -->  "+t2.getState());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("7 >> The State of Thread t2 after calling sleep() Method -->  "+t2.getState());
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("8 >> The State of Thread t2 when it is going to finish -->  "+t2.getState());
	}
}


class ExClass implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("6 >> The State of Thread t1 while invoking join() method -->  "+ThreadCycle.t1.getState());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}