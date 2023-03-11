package Exceptionday6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("task begins");
		// args is a commanand line argument
		try {
		int b=Integer.parseInt(args[0]);// 10 20 10 no exception
		int a=Integer.parseInt(args[1]);//10 'ten' 'hello' exception occurs
		int c=b/a;
		String name=args[2];//10
		int data[]= {a,b};
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("task completes");

	}

}
