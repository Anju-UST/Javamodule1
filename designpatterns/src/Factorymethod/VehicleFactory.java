package Factorymethod;

public class VehicleFactory {
	
		
	public static Vehicle newInstance(String car) {
		Vehicle vehicle =null;
		if(car==null)
			return null;
		else if(car.equals("Seltos"))
			vehicle=new seltos();
		else if(car.equals("Xcross"))
			vehicle =new Xcross();
		
		return vehicle;
		
	}

}
