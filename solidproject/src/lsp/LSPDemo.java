package lsp;

public class LSPDemo {
	
	public void calculateArea(shapeIface s) {
		System.out.println(s.getArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSPDemo lsp=new LSPDemo();
		
		//an instance of rectangle is passed
		lsp.calculateArea(new Rectangle(1,4));
		
		lsp.calculateArea(new Square(5));

	}

}
