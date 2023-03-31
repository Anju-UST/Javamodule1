package observer.consumer;

import observer.ifaces.WeatherObserver;

public class NewsPapers implements WeatherObserver{
	@Override
public void doUpdate(int temperature) {
		
		System.out.println("Newspapers are updating temperature as " + temperature);
		//boolean result = new NewsPapers() instanceof WeatherObserver;
		//System.out.println(result);

	}

}
