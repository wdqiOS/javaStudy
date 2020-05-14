package com.lz.test;

import com.lz.Animal.Circle;
import com.lz.Animal.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Circle c = new Circle(100);
		System.out.println(c.area());
		
		Rectangle r = new Rectangle(10, 5);
		System.out.println(r.area());
		
		
	}
}
