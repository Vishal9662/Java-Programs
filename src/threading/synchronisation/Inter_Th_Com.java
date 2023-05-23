package threading.synchronisation;

public class Inter_Th_Com {
	
	public static void main(String[] args) {
	
		Customer c=new Customer();
		
		Thread t1=new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		};
		
		t1.start();
		
		Thread t2=new Thread() {
			public void run() {
				c.deposit(100000);
			}
		};
		
		t2.start();
		
	}
}

class Customer{
	int amt=10000;
	
	synchronized void withdraw(int amt) {
		System.out.println("Withraw is in processing.....");
		
		if(this.amt<amt) {
			System.out.println("Not Enough Balance, Wait for Deposit...");
			
			try {
				wait();	//Wait for notify(), when it notified from other object then this is going to further process..
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.amt=-amt;
			
			System.out.println("Withdraw is completed...");
		}
	}
	
	synchronized void deposit(int amt) {
		System.out.println("Deposit is in processing....");
		
		this.amt=+amt;
		
		System.out.println("Deposit is completed..");
		
		notify(); //For notify other object, (Now, I completed my task you can start your task..)
	}
	
}

/*
Here is some important Methods like, wait(), notify(). notifyAll()

--> wait() ->     It is wait until or  either notified from another thread using notify() or notifyAll()..	
	 			  It is called only in synchronized method otherwise it throws exception..
	 			  It waits until object is notified..
	 			  It waits for specified amount of time..
 			  
--> notify() ->	 It is used for notify other thread object which is in waiting state, It is notify only one object and then execute only one thread..

--> notifyAll()-> It is used for notify all threads which is in waiting state, With this all threads are wakes up... 			  
*/