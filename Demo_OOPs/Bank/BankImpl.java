package Demo_OOPs.Bank;

public class BankImpl implements Bank{
	
	private int balance;
	
	public BankImpl(int balance) {
		this.balance=balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Deposit Amount is: "+amount);
		balance+=amount;
		System.out.println("Amount deposited successfully..");
	}

	@Override
	public void withdraw(int amount) {
		if(balance >= amount) {
			System.out.println("Withdrawing Amount is: "+amount);
			balance-=amount;
			System.out.println("Amount withdrawn successfully...");
		}else {
			throw new ArithmeticException("Balance not enough");
		}
	}

	@Override
	public int getMessage() {
		return balance;
	}

	@Override
	public String displayErrorMessage() {
		return "Invalid choice, Please enter correct choice...";
	}
	
	
}
