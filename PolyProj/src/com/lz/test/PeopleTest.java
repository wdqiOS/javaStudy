package com.lz.test;

import com.lz.people.Person;

public class PeopleTest {

	public static void main(String[] args) {
		
		Person lili = new Person();
		lili.age = 12;
		
		/*
		// 获取内部类对象实例，方式一：new 外部类.new 内部类
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
		
		// 获取内部类对象实例，方式二：外部类对象.new 内部类
		myHeart = lili.new Heart();
		System.out.println(myHeart.beat());
		
		// 获取内部类对象实例，方式三：外部类对象.获取内部类对象方法
		myHeart = lili.getHeart();
		System.out.println(myHeart.beat());
		
		*/
		
		// 获取静态内部类对象实例
		/*
		Person.Heart myHeart = new Person.Heart();
		System.out.println(myHeart.beat());
		// 静态内部类调用静态方法
		Person.Heart.say();
		*/
		// 方法内部类
		System.out.println(lili.getHeart());;
	}

}
