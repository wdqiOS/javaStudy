package com.lz.test;

import com.lz.singleton.Emperor;


import com.lz.singleton.SingletonEarth;
import com.lz.singleton.SingletonOne;
import com.lz.singleton.SingletonTwo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		SingletonOne one = SingletonOne.getInstance();
		SingletonOne two = SingletonOne.getInstance();
		SingletonOne three = SingletonOne.getInstance();
		System.out.println(one==two);
		System.out.println(two==three);
		System.out.println(three);
		System.out.println("=============== 饿汉式单例 ===============");
		System.out.println("第一个地球创建中。。。。");
		SingletonEarth oneEarth = SingletonEarth.getInstance();
		System.out.println("第二个地球创建中。。。。");
		SingletonEarth twoEarth = SingletonEarth.getInstance();
		System.out.println("第三个地球创建中。。。。");
		SingletonEarth threeEarth = SingletonEarth.getInstance();
		System.out.println("问：三个地球是同一个么？");
		System.out.println(oneEarth);
		System.out.println(twoEarth);
		System.out.println(threeEarth);
		
		System.out.println("=============== 懒汉式单例 ===============");
		SingletonTwo on = SingletonTwo.getInstance();
		SingletonTwo tw = SingletonTwo.getInstance();
		SingletonTwo thr = SingletonTwo.getInstance();
		System.out.println(on);
		System.out.println(tw);
		System.out.println(thr);
		
		System.out.println("创建1号皇帝对象");
		Emperor oneEm = Emperor.getInstance();
		System.out.println("创建2号皇帝对象");
		Emperor twoEm = Emperor.getInstance();
		System.out.println("创建3号皇帝对象");
		Emperor threeEm = Emperor.getInstance();
		System.out.println("三个皇帝对象依次是：");
		System.out.println(oneEm);
		System.out.println(twoEm);
		System.out.println(threeEm);
	}

}
