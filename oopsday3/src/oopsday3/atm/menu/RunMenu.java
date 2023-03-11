package oopsday3.atm.menu;

public class RunMenu {
	
		public static void main(String[] args)  {
			
			Bankmenu bank=new Bankmenu();
			try {
				bank.menu();
			} catch (NegativeAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//after throwing exception program will stop if it is not caught.
			}

			
			
		}
}
