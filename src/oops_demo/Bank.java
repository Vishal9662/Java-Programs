package oops_demo;

public interface Bank {

	void deposit(int amount);
	void withdraw(int amount);
	
	int getMessage();	
	
	String displayErrorMessage();
	
}