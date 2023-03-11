package oopsday2.atm;

public class BankofAmerica implements BankingIface {
	
	private Account account= new Account(100010, "john doe", "Salary", 50000);

	public double withdraw(double amount) {
		account.setBalance(account.getBalance()- amount);
		return account.getBalance();
	}
	
	public double deposit(double amount){
		
		account.setBalance(account.getBalance() + amount);
		return account.getBalance();
	}
	public double balanceEnquiry(int actno) {
		
		return account.getBalance();
		
	}
}
	