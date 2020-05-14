package com.lz.method;

public class Rectangle {
	// 求长方形面积的方法
	public int area() {
		int length = 10;
		int width = 5;
		int getArea = length * width;
		return getArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rc = new Rectangle();
		System.out.println("长方形的面积为："+rc.area());
	}

}
