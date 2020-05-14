package com.lz.test;

import com.lz.animal.Animal;
import com.lz.animal.Cat;
import com.lz.animal.Dog;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat one = new Cat();
		one.setName("花花");
		one.setSpecies("中华田园猫");
		one.eat();
		one.run();
		System.out.println("==================");
		Dog two = new Dog();
		two.setName("妞妞");
		two.setMonth(1);
		two.eat();
		two.sleep();
		System.out.println("==================");
		two.eat("凡凡");
//		System.out.println("==================");
//		Animal three = new Animal();
	}

}
