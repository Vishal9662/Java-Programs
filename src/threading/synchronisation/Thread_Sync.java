package threading.synchronisation;

class Counter{
	int count;
	public synchronized void incr() {
		count++;
	}
}

class Thread_Sync {

	public static void main(String[] args)  {
		Counter c=new Counter();
		
		//By Anonymous class instead of create new class..
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=50;i++) {
					c.incr();
				}
			}
		});	
		
		Thread t2=new Thread(new Runnable() {	
					@Override
					public void run() {
						for(int i=1;i<=50;i++) {
							c.incr();
						}
					}
				});	
		
		
		t1.start();
		t2.start();
		
		 try
	        {
			 t1.join();
			 t2.join();
	        }
	        catch(Exception e)
	        {
	            System.out.println("Interrupted");
	        }
		
		System.out.println("Counter : "+c.count);
	}
}


//synchronization allow only one thread at a time to complete the task...
//Synchronization is useful for preventing thread interference (jyare thread ni dakhalgiri rokvi hoy tyare synchronization use kri skay..)
//If we have 50 lines in method and we want only 5 lines is synchronized so in such case we can use synchronized block...
