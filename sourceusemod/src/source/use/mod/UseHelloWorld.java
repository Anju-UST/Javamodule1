package source.use.mod;

import source.mod.HelloWorld;

public class UseHelloWorld {

	public static void main(String[] args) {
		var x="anil";
		var y=23.76;
		var z='c';
		System.out.println(x.length());
		var d='z';
		var a=12;//type inference
		//var  f; cannot use without initialisation
		try {
			HelloWorld world= new HelloWorld();
			world.message();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
