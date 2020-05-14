package com.lz.test;

import com.lz.tel.Balloon;
import com.lz.tel.Bird;
import com.lz.tel.Plane;

public class IFlyTest {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		Plane plane = new Plane();
		plane.fly();
		Balloon balloon = new Balloon();
		balloon.fly();
	}
}
