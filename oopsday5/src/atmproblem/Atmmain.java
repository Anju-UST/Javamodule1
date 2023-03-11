package atmproblem;

import java.util.Scanner;

public class Atmmain {

	public static void main(String[] args) {
	
		AtmImp ao=new AtmImp();
		AtmFunctions af=new AtmFunctions();
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the amount : "); af.setAmount(sc.nextInt());
		 */
		
		ao.withdraw();
	
		

	}

}
