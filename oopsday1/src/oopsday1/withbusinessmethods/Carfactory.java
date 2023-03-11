package oopsday1.withbusinessmethods;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car  jaq =new Car("yellow",1000000, "toyota", "innova");
		jaq.start();
		jaq.changeGear(1);
		jaq.stop();
		
		Car  bmw =new Car("yellow",1000000, "toyota", "innova");
		bmw.start();
		bmw.changeGear(2);
		bmw.stop();
		
		
	
		
		

	}

}
