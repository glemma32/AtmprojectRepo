import java.util.Scanner;

public class Account {
	int accountNumber, pin;
	double balance;
	String userName;
	double deposit, withdrwas;
	
	
	public double getDeposit(double depositAmount) {
		Scanner UserInput = new Scanner(System.in);
		depositAmount = UserInput.nextDouble();
		balance= balance+depositAmount;
		return balance;
			}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdrwas(double withdrawAmount) {
		Scanner UserInput = new Scanner(System.in);
		withdrawAmount = UserInput.nextDouble();
		balance= balance-withdrawAmount;
		return balance;
	}
	public synchronized void setWithdrwas(double withdrwas) {
		this.withdrwas = withdrwas;
	}
	
	
}
