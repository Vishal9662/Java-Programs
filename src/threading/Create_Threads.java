package threading;

//Ex of Creating threads and performing single task by multiple threads...
//Each thread is run in different stack(means in memory, there is a small part for execution).

class ThreadA implements Runnable{

	@Override
	public void run() {
		System.out.println("In A Class By Runnable Interface..");
	}
	
}


public class Create_Threads extends Thread {

	@Override
	public void run() {
		System.out.println("Run method is invoked By Thread Class..");
	}
	
	
	public static void main(String[] args) {		
		Create_Threads t=new Create_Threads();
		Create_Threads tt=new Create_Threads();

		
		Thread t4=new Thread("First Thread");//Just for know the name of thread, here I give specific name, If there don't give anything then it will take by default like Tread-0
		String st=t4.getName();
		System.out.println("The name of Thread is:-> "+st);
	
		t.start();	//It is used for invoke or start the thread, and it invoke the run() method...
		tt.start();
		
		ThreadA a=new ThreadA();
		Thread t1=new Thread(a,"Thread By Runnable"); //when we implements Runnable interface, then we have to use constructor of thread and give the reference of thread class which implemented by runnable.
		
		Thread tt1=new Thread(new ThreadA()); //By passing anonymous object Class ThreadA
		
		System.out.println("Name of Thread By Runnable is:-> "+t1.getName());
		t1.start();
		tt1.start();
		
	}
}
