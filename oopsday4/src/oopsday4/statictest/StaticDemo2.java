package oopsday4.statictest;

public class StaticDemo2 {
	

	//void method{
		//System.out.println("from method");// instance method so object is mandatory  to call using class name put static before method name
	
	static int a;
	public static void method(){
		System.out.println("from method" + a);
		//method2    //not possible as it is nonstatic
	}
	public void method2() {
		//instance method can access static members
		System.out.println(a);
		method(); //access static method in nonstatic
	}
}
