package oopsday2.atm;

public class Account { // CLASS act like a data object here provides structure
	
	private int actno;
	private String name;
	private String actttype;
	private double  balance;
	
	public Account() {
	
	}

	public Account(int actno, String name, String actttype, double balance) {
		super();
		this.actno = actno;
		this.name = name;
		this.actttype = actttype;
		this.balance = balance;
	}

	public int getActno() {
		return actno;
	}

	public void setActno(int actno) {
		this.actno = actno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActttype() {
		return actttype;
	}

	public void setActttype(String actttype) {
		this.actttype = actttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
