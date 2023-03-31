package oopsday4.statictest;

public class Teststaticdemo {
	public static void main(String[] args)
	{
		System.out.println(staticdemo.a);
		staticdemo d =new staticdemo();
		System.out.println(d.a);
		staticdemo d1 =new staticdemo();
		System.out.println(d1.a);   // each time object is created a is incrementing
		staticdemo d2 =new staticdemo();
		System.out.println(d2.a);
		System.out.println(staticdemo.a);
		
		/*d.a=20;
		System.out.println(d1.a);//0  with static int a =20                      
		d1.a++;
		System.out.println(d.a);//21
	}*/
}
}