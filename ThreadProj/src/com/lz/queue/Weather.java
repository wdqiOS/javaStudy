package com.lz.queue;

public class Weather {
	private int wendu; // 温度
	private int shidu; // 湿度
	boolean flag = false; // 标记是否生成了温度
	
	public int getWendu() {
		return wendu;
	}
	public void setWendu(int wendu) {
		this.wendu = wendu;
	}
	public int getShidu() {
		return shidu;
	}
	public void setShidu(int shidu) {
		this.shidu = shidu;
	}
	
	// 生成天气数据
	public synchronized void producerWeather(int wendu, int shidu) {
		if(flag) { // 有生成天气
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setWendu(wendu);
		this.setShidu(shidu);
		System.out.println("生成"+this);
		
		flag = true;
		notifyAll();
	}
	// 读取天气数据
	public synchronized void readWeather() {
		if(!flag) { // 表示没有天气数据
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("读取"+this);
		
		flag = false;
		notifyAll(); // 读取完了，唤醒等待线程
	}
	
	@Override
	public String toString() {
		return "天气数据[温度："+wendu+",湿度："+shidu+"]";
	}
	
}
