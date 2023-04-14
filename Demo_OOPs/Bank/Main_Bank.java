package Demo_OOPs.Bank;

import java.util.Scanner;

public class Main_Bank {

	public static void main(String[] args) {
		Bank bank=new BankImpl(0);
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Deposit \n2.Withdraw \n3.Check Balance \n4.Exit");
			System.out.println("Enter your choice : ");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
					System.out.println("Enter Amount for deposit: ");
					int depositAmount=sc.nextInt();
					bank.deposit(depositAmount);
					System.out.println("Now available balance is: "+bank.getMessage());
					break;
					
			case 2:
					System.out.println("Enter Amount for withdraw: ");
					int withdrawAmount=sc.nextInt();
					bank.withdraw(withdrawAmount);
					System.out.println("Now available balance is: "+bank.getMessage());
					break;
					
			case 3:
					System.out.println("Available balance is: "+bank.getMessage());
					break;
					
			case 4:
					System.out.println("Thank you, User...!!");
					System.exit(0);
					
			default:
					System.out.println(bank.displayErrorMessage());
					
			}
			System.out.println("===============================");
			
		}
	}
	
}
