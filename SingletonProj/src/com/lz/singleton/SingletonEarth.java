package com.lz.singleton;

public class SingletonEarth {
	// 1. 私有构造
	private SingletonEarth() {
	}
	
	// 2. 静态私有实例对象
	private static SingletonEarth _instance = new SingletonEarth();
	
	// 3. 公有静态方法返回静态私有实例对象
	public static SingletonEarth getInstance() {
		System.out.println("地球产生");
		return _instance;
	}
}
