package Demo_OOPs.Bank;

public interface Bank {

	void deposit(int amount);
	void withdraw(int amount);
	
	int getMessage();	
	
	String displayErrorMessage();
	
}
