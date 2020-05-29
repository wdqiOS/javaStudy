package com.lz.queue;

import java.util.Random;

public class GenerateWeather implements Runnable {
	Weather weather;
	public GenerateWeather(Weather weather) {
		this.weather = weather;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r = new Random(1);
		for(int i = 0; i < 100; i++) {
			weather.producerWeather(r.nextInt(40), r.nextInt(100));
		}
	}
	
}
