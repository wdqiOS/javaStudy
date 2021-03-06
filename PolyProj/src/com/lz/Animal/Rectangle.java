package com.lz.Animal;

public class Rectangle extends Shape {
	// 属性
	private double length;
	private double wide;
	
	public Rectangle() {};
	public Rectangle(double length, double wide) {
		this.setLength(length);
		this.setWide(wide);
	}
	
	// set/get方法
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setWide(double wide) {
		this.wide = wide;
	}
	public double getWide() {
		return wide;
	}
	
	@Override
	public double area() {
		
		return this.length * this.wide;
	}

}
