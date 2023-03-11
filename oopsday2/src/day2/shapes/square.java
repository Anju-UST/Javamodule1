package day2.shapes;

public class square implements shapeIface {
	private int length;
	

	public square(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "square [length=" + length + "]";
	}
	public void area()
	{
		int a=length*length;
		System.out.println("area is " + a);
	}
	

}
