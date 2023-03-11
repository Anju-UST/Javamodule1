package source;

public class NonSubClass {
	public NonSubClass() {
		// TODO Auto-generated constructor stub
		Parent p =new Parent();
		System.out.println(p.b);
		System.out.println(p.c);
		System.out.println(p.d);// for subclass members can be accessed without object ,here object is needed
	}

}
