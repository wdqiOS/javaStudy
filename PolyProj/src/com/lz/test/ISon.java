package com.lz.test;

// 接口也可以实现继承，并且可以继承多个父接口
public interface ISon extends IFather, IFather2 {
	void run();
	
	default void connection() {
		System.out.println("ISon中的connection");
	}
}
