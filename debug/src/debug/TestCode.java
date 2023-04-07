package debug;

public class TestCode {
	int a=0;
	boolean b=false;
	int factorial(int n) {
		if(n<1)
			return 1;
		return n*factorial(subtract(n));
	}
	int subtract(int n) {
		return n-1;
	}
	
	
	void m1(){
		  System.out.println("from m1..");
		}
		void m2(){
			this.b=false;
		  System.out.println('1'+this.a++);
		  System.out.println('2');
		  System.out.println('3');
		  this.m1();//instance call in typescript it is mandatory to call a instance variable
		  this.b=true;
		  System.out.println('4'+this.a++);
		  System.out.println('5');
		  System.out.println("6"+this.a++);
		}
		public static void main(String[] args) {
			//new TestCode().m2();
			new TestCode().factorial(5);
		}
}
