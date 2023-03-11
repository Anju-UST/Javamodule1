package oopsday4.polymorohism;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle(2.5 ,5.0);
		double result=s.area();
		System.out.println("area is  " + result);
		
		s =new Circle(4);
		 result =s.area();
		System.out.println("area is " + result);
		
		s =new Square(5);
		 result=s.area();
		System.out.println("area is " + result);  
		
	}

}
