package threading.synchronisation;

public class DeadLock {

	public static void main(String[] args) {
		String s1="Vishal";
		String s2="Jaydip";
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				synchronized(s1) {
					System.out.println("Thread-1 is Running for Task 1");
				}
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(s2) {
					System.out.println("Thread-1 is Running for Task 2");
				}
			}
		};
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				synchronized(s1) {
					System.out.println("Thread-2 is Running for Task 1");
				}
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(s2) {
					System.out.println("Thread-2 is Running for Task 2");
				}
			}
		};
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
	}
}


//For Avoid DeadLock Condition --->
// Avoid Nested Classes || Avoid Unnecessary locks
