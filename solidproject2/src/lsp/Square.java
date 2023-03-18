package lsp;

public class Square implements shapeIface {
	
	private int side;
	

	public Square(int side) {
		super();
		this.side = side;
	}


	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}
}
