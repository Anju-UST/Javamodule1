package oopsday4.composition;

public class A {

		private int x=5;
		private int y=2;
		public A()
		{
			System.out.println("from method");
		}
		public A(int x, int y) {
			super();
			this.x = x;
			this.y = y;
			System.out.println("from A");
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		
		
}
