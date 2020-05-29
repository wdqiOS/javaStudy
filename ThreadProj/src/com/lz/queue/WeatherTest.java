package com.lz.queue;

public class WeatherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weather weather = new Weather();
		GenerateWeather gw = new  GenerateWeather(weather);
		// 生成天气
		new Thread(gw).start();
		// 读取天气
		new Thread(new ReadWeather(weather)).start();
	}

}
