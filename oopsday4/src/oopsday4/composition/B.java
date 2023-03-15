package oopsday4.composition;

public class B extends A {

	B(){
		//System.out.println(x+y);//0
		super(10,20);//for constructor chaining
		System.out.println();
	}
}
