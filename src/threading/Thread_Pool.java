package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool implements Runnable{
	
	String str;
	public Thread_Pool(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running with "+str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(2);
		
		service.submit(new Thread_Pool("Str-1"));
		service.submit(new Thread_Pool("Str-2"));
		service.submit(new Thread_Pool("Str-3"));
		service.submit(new Thread_Pool("Str-4"));
		service.submit(new Thread_Pool("Str-5"));

		service.shutdown();
		
	}

}
