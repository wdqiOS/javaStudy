package com.lz.practice;

public class Person {
	private String name;
	private int age;
	private String sex;

	// 无参构造方法
	public Person() {

	}

	// 带参构造方法
	public Person(String name, int age, String sex) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
	}

	// 成员属性set/get方法
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

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	// 重写toString方法
	public String toString() {
		return "姓名：" + this.getName() + " 年龄：" + this.getAge() + " 性别：" + this.getSex();
	}
}
