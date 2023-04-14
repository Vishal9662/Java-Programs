package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {

	String s;
	
	public ThreadPool(String s) {
		this.s=s;
		
	}
	
	public static void main(String[] args) {
		ExecutorService s=Executors.newFixedThreadPool(2);
		
		s.submit(new ThreadPool("ssc"));
		s.submit(new ThreadPool("+1 +2"));
		s.submit(new ThreadPool("Vishal"));
		s.submit(new ThreadPool("Jaydip"));
		s.submit(new ThreadPool("Bapu"));
		
		s.shutdown();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is Running with -> "+s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is a Ending..");
	}

}

/*
 It saves our time and gives the best performance..
The Real time use of Thread Pool is in Servlet and JSP where the container creates a thread pool to process the request..

*/