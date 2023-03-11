package oopsday3.atm.menu;


import java.util.Scanner;

import oopsday3.atm.exception.InsufficientFundsException;

public class Bankmenu {

	BankofAmerica2 boa =new BankofAmerica2();
	public void menu() throws NegativeAmountException
	{
	
    	  System.out.println("1.Display account");
    	  
          System.out.println("2. Deposit money");

          System.out.println("3. Withdraw money");

          System.out.println("4. Check balance");

          System.out.println("5. Exit");
         
        	  
        	  
        	  Scanner scanner=new Scanner(System.in);
        	  int ch=0;
        	  int amount,actno;
        	 loop: do {
        
        	  System.out.println(" enter your choice:");
        	  ch = scanner.nextInt();
          switch (ch) {

          case 1:{
        	  System.out.println("enter actno:");
       	   		actno=scanner.nextInt();
        	         	 
  			
       	   		boa.displayAccount(actno);
                
                break;
          }

          case 2:
        	  System.out.println("enter actno:");
        	   actno=scanner.nextInt();
        	  System.out.println("enter amount to deposit");
        	   amount= scanner.nextInt();
        	  double deposit= boa.deposit(amount, actno);
               System.out.println("total deposit:"+deposit); 
                break;

          case 3:
        	  System.out.println("enter actno:");
        	   actno=scanner.nextInt();
        	  System.out.println("enter amount to withdraw:");
        	   amount= scanner.nextInt();
			double withdraw=0;
			try {
				withdraw = boa.withdraw(amount,actno);
			} catch (InsufficientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                System.out.println("amount after withdrawal:"+withdraw);
                break;
               
          case 4 :
        	  System.out.println("enter actno:");
        	  actno=scanner.nextInt();
        	  double balance=boa.balanceEnquiry(actno);
        	  System.out.println(balance);
        	  break;

          case 5:

                break loop;

          default:

                System.out.println("Wrong choice.");

                break;

          }

          System.out.println();

    } while (ch!=5);
	}
	
  

	public Bankmenu() {
		
		Account a1 = new Account(101,"john Doe", "savings", 500);
		Account a2 = new Account(102,"jone Doe", "savings", 700);
		Account a3 = new Account(103,"jason Doe", "salary", 850);
		Account a4 = new Account(104,"james Doe", "salary", 600);
		Account a5 = new Account(105,"jane Doe", "pension", 750);
		
		
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
	
}
}
