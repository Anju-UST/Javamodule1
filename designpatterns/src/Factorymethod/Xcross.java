package Factorymethod;

public class Xcross implements Vehicle {

	public void start() {
		System.out.println("started....."+getClass());
	}

	public void stop() {
		System.out.println("stopped..."+getClass());
		
	}
	public void honk() {
		System.out.println("pom pom..."+getClass());
	}
	
	public void move() {
		System.out.println("its moving"+getClass());
	}


	}
