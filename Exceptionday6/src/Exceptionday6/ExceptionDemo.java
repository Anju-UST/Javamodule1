package Exceptionday6;

public class ExceptionDemo {
	public static void main(String[] args) {

		System.out.println("program task begins");
		int a = 10;
		int b = 0;

		 try {
		  int c=a/b;//point of exception System.out.println(c);
		  }catch(ArithmeticException e) { 
			  System.out.println("cannot / by zeo"); 
			}
		 
		System.out.println("program completed task");
	}

}
