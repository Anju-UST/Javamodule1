package oopsday2.atm;

public class BankTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingIface bom= new BankofAmerica();
		double balance=bom.deposit(250);
		System.out.println("balance after deposit :$ " +balance);
		System.out.println(bom);
		balance=bom.withdraw(500);
		System.out.println(" balance after withdraw = $" +balance);
		
		
		

	}

}
