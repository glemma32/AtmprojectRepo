
public class ATMApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String atmChoice;
		double depAmount;
		ATM atm = new ATM();
		
        String[] transaction = atm.getTransaction();
        for (String word: transaction) {
            print(word);
        }
            
        print("What would you like to do?");
       	String result = atm.getChoice(atmChoice);
        if(result=="Deposit"){
        	Double updatedAccount = atm.atmAccount.getDeposit(depAmount);
        }
       
	}
	private static void print(String s)
	{
		 System.out.println(s);
	}
	private static void print(double d)
	{
		 System.out.println(d);
	}
}
