package oopsday4.statictest;

public class TestStaticdemo2 {

	public static void main(String[] args) {
		
			StaticDemo2 d1=new StaticDemo2();
			d1.method();
			StaticDemo2.method();// from method
			d1.method2();
			
			
			
			
			double result=Math.PI*2*5*5;
			System.out.println(result);
			System.out.println(Math.E);
	}
	
}
