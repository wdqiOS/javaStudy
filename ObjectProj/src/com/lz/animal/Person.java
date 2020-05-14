package com.lz.animal;

public class Person {
	// 属性
	String name; // 名字
	int age; // 年龄
	String grade; // 年级
	/**
	 * student方法
	 */
	public void student() {
		System.out.println("我是一名学生");
	}
	
	/**
	 * 性别输出方法
	 * @param sex
	 */
	public void sex(String sex) {
		System.out.println("我是一个"+sex+"孩");
	}
	/**
	 * 介绍自己的方法
	 */
	public void mySelf() {
		System.out.println("我叫李明，今年10岁了，读小学五年级了。");
	}
	
	
}
