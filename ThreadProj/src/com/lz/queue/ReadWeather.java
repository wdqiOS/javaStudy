package com.lz.queue;

public class ReadWeather implements Runnable {
	Weather weather;
	public ReadWeather(Weather weather) {
		this.weather = weather;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			weather.readWeather();
		}
	}
	
}
