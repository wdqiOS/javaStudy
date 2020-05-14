package com.lz.Animal;

public class Circle extends Shape {
	// 属性：半径
	private double  r;
	// 无参构造
	public Circle () {}
	// 有参构造
	public Circle (double r) {
		this.setR(r);
	}
	
	// set/get方法
	public void setR(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}
	
	@Override
	public double area() {
		
		return this.r * this.r;
	}

}
