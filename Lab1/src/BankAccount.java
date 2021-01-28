import java.util.HashMap;
import java.util.Random;

/*
 * Author: Pratap Gurung
 * Desc: Bank Account Prototype
 * date: Jan 27, 2021
 */
public class BankAccount {
	
	//instance variables
	private String name;
	//private String accountNumber;
	private long accountNumber;
	private double balance;
	
	/*
	 * class variable
	 */
	private static long referenceAccountNumber = 100006545987L;

	BankAccount(String name, double initBal){
		this.name = name;
		balance = initBal;
		generateNumber();
	}
	
	BankAccount(String name){
		this.name = name;
		balance = 0;
		generateNumber();
	}
	
	private void generateNumber() {
		referenceAccountNumber += 1;
		accountNumber = referenceAccountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {	
		return balance;
	}

	
	/*
	 * withdraw
	 */
	public boolean  withdraw(double amount) {
		if((balance - amount) > 0) {
			balance -= amount;
			System.out.println("Withdraw successfull !!");
			displayInfo();
			return true;
		}
		System.out.println("Balance less than withdraw amount !!");
		displayInfo();
		return false;	
	}
	/*
	 * withdraw with fee
	 */
	public boolean  withdraw(double amount, double fee) {
		if( (balance - amount) > 0) {
			balance = balance - (amount + fee);
			System.out.println("Withdraw successfull !!");
			displayInfo();
			return true;
		}
		System.out.println("Balance less than withdraw amount !!");
		displayInfo();
		return false;
	}
	
	/*
	 * deposit
	 */
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successfull !!");
		displayInfo();
	}
	/*
	 * deposit with interest
	 */
	public void deposit(double amount, double interest) {
		balance += amount + interest;
		System.out.println("Deposit successfull !!");
		displayInfo();
		
	}
	
	/*
	 * display funds
	 */
	public void displayInfo() {
		System.out.println("---------------------------------------------------------");
		System.out.println("| Account Number: " + accountNumber );
		System.out.println("| Balance: " + balance );
		System.out.println("---------------------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bck1 = new BankAccount("Pratap", 10000);
		BankAccount bck2 = new BankAccount("Kris", 20000);
		BankAccount bck3 = new BankAccount("Joe");
		
		bck1.deposit(500);
		bck2.deposit(500);
		bck3.deposit(500000);
		
		bck1.withdraw(200);
		bck2.withdraw(500);
		bck3.withdraw(5000000);
		
		bck1.deposit(500, 10);
		bck2.deposit(500, 5);
		bck3.deposit(500000, 100);
		

		bck1.withdraw(500, 10);
		bck2.withdraw(500, 5);
		bck3.withdraw(5000, 100);
	}

}












