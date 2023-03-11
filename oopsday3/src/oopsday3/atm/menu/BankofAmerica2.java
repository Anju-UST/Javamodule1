package oopsday3.atm.menu;

import oopsday3.atm.exception.InsufficientFundsException;

public class BankofAmerica2 implements BankingIface2 {

	private Account[] accounts = new Account[5];
	private int accountIndex = 0;

	public BankofAmerica2() {

	}

	public BankofAmerica2(Account[] accounts) {
		super();
		this.accounts = accounts; // constructor with array of account
	}

	public double withdraw(double amount, int actno) throws InsufficientFundsException {
		//for exception 

		double tempBal = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno)
			{
				if(accounts[i].getBalance() < amount)
				{
					throw new InsufficientFundsException("insufficient balance");
				}
			
				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
                break;
			}
		}

		return tempBal;

	}

	public double deposit(double amount,int actno) throws NegativeAmountException {
		double tempBal=0;
		//for exception
		if(amount<0)
		{
			throw new NegativeAmountException("cannot deposit -Ve" +amount);//here throw for method declaration throws
		}
		for(int i=0;i<accounts.length;i++) 
		{
			if(accounts[i].getActno() == actno)
			{
				tempBal= accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
			return tempBal;
	}
	


	public double balanceEnquiry(int actno) {
		double tempBal=0;
	
		for(int i=0; i < accounts.length;i++) {
			if(accounts[i].getActno() == actno)
			{
				tempBal= accounts[i].getBalance();
				break;
			}
		}
		return tempBal;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {

		if (this.accountIndex < accounts.length)
			accounts[this.accountIndex++] = account;
		else
			System.out.println("operation not allowed");

	}
	
	public void displayAccount(int actno) {
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno()==actno)
			{
				System.out.println(accounts[i].getActno());
				System.out.println(accounts[i].getName());
				System.out.println(accounts[i].getActttype());
				System.out.println(accounts[i].getBalance());
				break;
			}
		}
	}
}