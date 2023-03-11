package oopsday3.overloading;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math = new Math();
		int  result=math.add(10,20);
		System.out.println(result);
		 result=math.add(10,20,20);
		System.out.println(result);
		
		double result2= math.add(10, 10);
		System.out.println(result2);
		 result2=math.add(17.5, 20, 20);
		System.out.println(result2);
		
		result2=math.add(17L, 20L, 20L);
		System.out.println("long:"+result2);//57.
		
		result2=math.add(10.5f, 20, 25f);
		System.out.println(result2);//55.5
	}
}
