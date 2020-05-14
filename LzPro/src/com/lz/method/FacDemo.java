package com.lz.method;

public class FacDemo {
	// 求阶层的方法
	public int fac(int n) {
		int s = 1;
		for(int i = 1; i <= n; i++) {
			s *= i;
		}
		return s;
	}
	public static void main(String[] args) {
		FacDemo facDemo = new FacDemo();
		facDemo.fac(4);
		// 求阶乘的和
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			sum += facDemo.fac(i);
		}
		System.out.println("1!+2!+3!+...+5!的和为："+sum);
		

	}

}
