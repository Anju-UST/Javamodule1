package Factorymethod;

public class UsevehicleFactory {
	public static void main(String[] args) {
		Vehicle seltos=VehicleFactory.newInstance("Seltos");
		seltos.honk();
		Vehicle suzuki=VehicleFactory.newInstance("Xcross");
		suzuki.move();
	}

}
