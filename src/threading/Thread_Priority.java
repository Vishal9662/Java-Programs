package threading;

public class Thread_Priority extends Thread {
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		Thread_Priority t=new Thread_Priority();
		Thread_Priority t1=new Thread_Priority();
		
		t.setName("Pelo Thread");	//Set name of Thread..
		t1.setName("Bijo Thread");
		
		System.out.println("Priority of Pelo Thread : "+t.getPriority());	//For get default priority...
		System.out.println("Priority of Bijo Thread : "+t1.getPriority());
		
		
		t.setPriority(MIN_PRIORITY); //Set priority..
		t1.setPriority(4);	//Give between 1 to 10,but don't give more than 10
		
		
		System.out.println("Priority of Pelo Thread : "+t.getPriority());
		System.out.println("Priority of Bijo Thread : "+t1.getPriority());

		
		t.start();
		t1.start();
		
	}

}
