package lsp;

public class Rectangle implements shapeIface {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		
		return this.length * this.breadth;
	}

}
