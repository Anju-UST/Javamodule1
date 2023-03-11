package oopsday3;

public class Compare {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2= new Rectangle();
		
		Triangle t1=new Triangle();
		Triangle t2=new Triangle();
		
		//comparing primitives
		int a = 10;
		int b=35;
		
		boolean result = a==b; //are they equal or not
		// comparing object 2 cases: 1. comparing references 2. comparing members
		
		result = r1==r2;//false  hashcode different
		System.out.println(result);
		
		result = t1==t2;
		System.out.println(result);
		
		//result = t1==r1;  incompatible operand type so error
		//System.out.println(result);
		Rectangle r3= r1;// refernce to copy of same objects
		result = r3==r1;//true  r1 is pointer/reference to object in memory
		System.out.println(result);
		System.out.println(r1.hashCode());
		System.out.println(r3.hashCode());
		System.out.println(r2.hashCode());
		
		result= r1.equals(r2);
		System.out.println(result);
		
		result= r1.equals(r3);  // equals method applicable only for object not for primitives
		System.out.println(result);
		
		r1.setLength(35.5);
		r1.setBreadth(75.45);
		
		r2.setLength(35.5);
		r2.setBreadth(75.45);
		
		if(r1.getBreadth()== r2.getBreadth() && r1.getLength()==r2.getLength())
		{
			System.out.println("they have same length and breadth");
		}
		else
			System.out.println("they are not same");
		
		t1.setS1(35.5);
		t1.setS2(45.75);
		t1.setS3(65.5);
		
		if(r1.getLength()== t1.getS1()) // we are not comparing objects r1 and t1 we are comparing data members of r1 and t1.
		{
			System.out.println("same");
		}
		else
			System.out.println("not same");
		
	
	}
	

}
