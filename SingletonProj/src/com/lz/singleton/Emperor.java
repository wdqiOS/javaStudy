package com.lz.singleton;

public class Emperor {
	// 1. 定义私有构造方法
	private Emperor() {	
	}
	
	// 2. 定义私有静态类对象
	private static Emperor instance = null;
	
	// 3. 定义共有静态方法返回该类内的私有静态对象
	public static Emperor getInstance() {
		if(instance == null)
			instance = new Emperor();
		return instance;
	}
}
