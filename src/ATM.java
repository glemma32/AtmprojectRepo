import java.util.Scanner;

public class ATM {
	int accountNumber, pin;
	String userName, choice;
	String transaction[];
	
	Account atmAccount;
	
	
	public  String[] getTransaction() {
			String transaction[] = {"Deposit", "Withdraw", "Check balance"};
			return transaction;
			
	}
	public  void setTransaction(String[] transaction) {
		this.transaction = transaction;
	}
	public String getChoice(String choice ) {
		Scanner UserInput = new Scanner(System.in);
		choice = UserInput.next();
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public String getUserName() {
		Scanner UserInput = new Scanner(System.in);
		userName = UserInput.next();
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAccountNumber() {
		Scanner UserInput = new Scanner(System.in);
		accountNumber = UserInput.nextInt();
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPin() {
		Scanner UserInput = new Scanner(System.in);
		pin = UserInput.nextInt();
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	//public Static String 

}
