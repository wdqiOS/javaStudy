package com.lz;

public class FloatDemo {
	public static void main(String[] args) {
		System.out.println("浮点型");
		// 单精度
		float f = 123.328F;
		System.out.println("f=" + f);
		// 双精度
		double d = 5543.234;
		System.out.println("d=" + d);
		
		// 将整型赋值给浮点型
		double d1 = 123;
		System.out.println("d1=" + d1);
		
		// 变量间的赋值
		double d2 = d;
		System.out.println("d2="+d2);
	}
}
