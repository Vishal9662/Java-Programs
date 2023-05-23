package java_Concurrency;

import java.util.concurrent.Executor;

public class TestExecutor implements Executor {

	public static void main(String[] args) {
		
		
				
	}

	public void execute() {
		Executor e=new TestExecutor();
		
		e.execute( () -> {
			
			System.out.println("Hyy");
		});
		
	}


	@Override
	public void execute(Runnable command) {
		command.run();
		
	}
	

}
