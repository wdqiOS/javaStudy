package com.lz.method;

public class MaxDemo {
	// 求最大值的方法
	public void max(float a, float b) {
		float max;
//		if(a > b) {
//			max = a;
//		}else {
//			max = b;
//		}
		max = a > b ? a : b;
		System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
	}
	
	public void max(double a, double b) {
		double max = a > b ? a : b;
		System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDemo maxDemo = new MaxDemo();
		float a = 5, b = 3;
		maxDemo.max(a, b);
		
		float m = 4.4f, n = 3.f;
		maxDemo.max(m, n);
		
		maxDemo.max(3.0f, 12.8f);
		
		maxDemo.max(1.2, 3.4);
		
	}

}
