package oopsday2.atm;

public interface BankingIface {
	
	public abstract double withdraw(double amount);
	public double deposit(double amount);
	public double balanceEnquiry(int actno);
	
}
