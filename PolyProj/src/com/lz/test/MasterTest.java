package com.lz.test;

import com.lz.Animal.Animal;
import com.lz.Animal.Cat;
import com.lz.Animal.Dog;
import com.lz.Animal.Master;

public class MasterTest {
	public static void main(String[] args) {
		
		Master master = new Master();
		Cat one = new Cat();
		Dog two = new Dog();
		
		master.feed(one);
		master.feed(two);
		
		System.out.println("========================");
		boolean isManyTime = true;
		Animal temp;
		if(isManyTime) {
			temp = master.hasManyTime();
		} else {
			temp = master.hasLittleTime();
		}
		System.out.println(temp);
		System.out.println("=========================");
		isManyTime = false;
		master.raise(isManyTime);
		
		
	}
}
