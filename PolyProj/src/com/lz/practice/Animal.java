package com.lz.practice;

public abstract class Animal implements IAct {
	// 属性
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	// 抽象方法：描述喜好
	public abstract void love();
}
