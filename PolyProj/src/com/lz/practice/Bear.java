package com.lz.practice;

public class Bear extends Animal implements IAct {

	
	public Bear() {
		
	}
	public Bear(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("爱好：喜欢卖萌");
	}
	
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("表演者："+this.getName());
		System.out.println("年龄："+this.getAge()+"岁");
		this.love();
		System.out.println("技能：挽着花篮，打着雨伞，自立走秀");
	}

}
